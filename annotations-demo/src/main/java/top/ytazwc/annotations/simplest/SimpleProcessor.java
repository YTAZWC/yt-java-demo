package top.ytazwc.annotations.simplest;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * @author 花木凋零成兰
 * @title SimpleProcessor
 * @date 2024/5/28 22:13
 * @package top.ytazwc.annotations.simplest
 * @description @Simple的编译时简单处理器
 * 将注解有关信息打印出来
 * 解决注解处理器不生效问题：<a href="https://www.xudongvp.com/?p=463"/>
 */
@SupportedAnnotationTypes("top.ytazwc.annotations.simplest.Simple") // 设置处理器支持的注解
@SupportedSourceVersion(SourceVersion.RELEASE_8)    // 设置支持的JDK版本为JDK8
public class SimpleProcessor extends AbstractProcessor {
    /**
     *
     * @param annotations 请求处理的批注类型 告知哪个注解是存在的
     * @param env  环境，以获取有关当前和上一轮的信息 保留了剩余信息
     * @return
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        // 遍历打印存在的每一个注解
        for (TypeElement annotation : annotations) {
            System.out.println(annotation);
        }
        // 获取被@Simple注解的元素 集合
        Set<? extends Element> annotatedWith = env.getElementsAnnotatedWith(Simple.class);
        // 遍历被@Simple注解的元素集合 并对每个元素使用display()方法
        for (Element element : annotatedWith) {
            display(element);
        }
        return false;
    }
    private void display(Element element) {
        System.out.println("==== " + element + " ====");
        /**
         * element.getModifiers() 返回此元素的修饰符，不包括批注。包括隐式修饰符，例如接口成员的 public 和 static 修饰符。
          */
        System.out.println(element.getKind() +
                " : " + element.getModifiers() +
                " : " + element.getSimpleName() +
                " : " + element.asType());
        /**
         * Element只能执行编译器解析的所有基本对象共有的操作，而类和方法之类有额外的信息需要提取
         * 需要进行检查为哪种类型 并向下转型为更具体的元素类型 针对该元素类型获取其额外的信息
         */
        if (element.getKind().equals(ElementKind.CLASS)) {
            TypeElement typeElement = (TypeElement) element;
            System.out.println(typeElement.getQualifiedName());
            System.out.println(typeElement.getSuperclass());
            System.out.println(typeElement.getEnclosedElements());
        }
        if (element.getKind().equals(ElementKind.METHOD)) {
            ExecutableElement ex = (ExecutableElement) element;
            System.out.print(ex.getReturnType() + " ");
            System.out.print(ex.getSimpleName() + "(");
            System.out.println(ex.getParameters() + ")");
        }
    }
}
