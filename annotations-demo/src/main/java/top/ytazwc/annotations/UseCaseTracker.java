package top.ytazwc.annotations;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 花木凋零成兰
 * @title UseCaseTracker
 * @date 2024/5/27 22:34
 * @package top.ytazwc.annotations
 * @description @UseCase注解处理器
 * 读取被@UseCase注解的PasswordUtils类
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCase, Class<?> c1) {
        // 遍历类的方法
        for (Method method : c1.getDeclaredMethods()) {
             UseCase uc = method.getAnnotation(UseCase.class);
             if (uc != null) {
                 System.out.println("Found Use Case " + uc.id() + "\n " + uc.description());
                 // 删除已实现用例
                 useCase.remove(Integer.valueOf(uc.id()));
             }
        }
        useCase.forEach(i -> System.out.println("Missing use case " + i));
    }

    public static void main(String[] args) {
        List<Integer> useCase = IntStream.range(47, 51).boxed().collect(Collectors.toList());
        trackUseCases(useCase, PasswordUtils.class);
    }
}
