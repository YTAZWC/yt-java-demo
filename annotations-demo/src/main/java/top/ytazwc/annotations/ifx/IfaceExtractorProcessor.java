package top.ytazwc.annotations.ifx;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.util.Elements;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 花木凋零成兰
 * @title IfaceExtractorProcessor
 * @date 2024/5/29 14:37
 * @package top.ytazwc.annotations.ifx
 * @description @ExtractInterface的注解处理器
 * 会创建一个新的 interface 源代码文件
 */
@SupportedAnnotationTypes("top.ytazwc.annotations.ifx.ExtractInterface")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class IfaceExtractorProcessor extends AbstractProcessor {
    private ArrayList<Element> interfaceMethods = new ArrayList<>();
    Elements elementUtils;
    private ProcessingEnvironment processingEnvironment;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        this.processingEnvironment = processingEnv;
        elementUtils = processingEnv.getElementUtils();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        for (Element elem : env.getElementsAnnotatedWith(ExtractInterface.class)) {
            String interfaceName = elem.getAnnotation(ExtractInterface.class).interfaceName();
            for (Element enclosed : elem.getEnclosedElements()) {
                if (enclosed.getKind().equals(ElementKind.METHOD)
                        && enclosed.getModifiers().contains(Modifier.PUBLIC)
                        && !enclosed.getModifiers().contains(Modifier.STATIC)
                ) {
                    interfaceMethods.add(enclosed);
                }
            }
            if (!interfaceMethods.isEmpty()) {
                writeInterfaceFile(interfaceName);
            }
        }
        return false;
    }

    private void writeInterfaceFile(String interfaceName) {
        try (
                Writer writer = processingEnvironment
                        .getFiler()
                        .createSourceFile(interfaceName)
                        .openWriter();
                ) {
            // 获取包名
            String packageName = elementUtils.getPackageOf(interfaceMethods.get(0)).toString();
            writer.write("package " + packageName + ";\n");
            writer.write("public interface " + interfaceName + "{\n");
            // 遍历方法
            for (Element elem : interfaceMethods) {
                ExecutableElement method = (ExecutableElement) elem;
                String signature = " public ";
                signature += method.getReturnType() + " ";
                signature += method.getSimpleName();
                signature += createArgList(method.getParameters());
                System.out.println(signature);
                writer.write(signature + ";\n");
            }
            writer.write("}");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String createArgList(List<? extends VariableElement> parameters) {
        String args = parameters.stream()
                .map(p -> p.asType() + " " + p.getSimpleName())
                .collect(Collectors.joining(", "));
        return "(" + args + ")";
    }
}
