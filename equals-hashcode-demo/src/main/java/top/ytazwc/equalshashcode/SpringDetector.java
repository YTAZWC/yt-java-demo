package top.ytazwc.equalshashcode;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 花木凋零成兰
 * @title SpringDetector
 * @date 2024/5/4 22:33
 * @package top.ytazwc.equalshashcode
 * @description What will the weather be?
 */
public class SpringDetector {
    public static <T extends Groundhog> void detectSpring(Class<T> type) {
        try {
            Constructor<T> ghog = type.getConstructor(int.class);
            Map<Groundhog, Prediction> map = IntStream.range(0, 10)
                    .mapToObj(i -> {
                        try {
                            return ghog.newInstance(i);
                        } catch(Exception e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .collect(Collectors.toMap(
                            Function.identity(),
                            gh -> new Prediction()));
            map.forEach((k, v) -> System.out.println(k + ": " + v));
            Groundhog gh = ghog.newInstance(3);
            System.out.println("Looking up prediction for " + gh);
            if(map.containsKey(gh)) {
                System.out.println(map.get(gh));
            } else {
                System.out.println("Key not found: " + gh);
            }
        } catch(NoSuchMethodException
                | IllegalAccessException
                | InvocationTargetException
                | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        detectSpring(Groundhog.class);
    }
}
