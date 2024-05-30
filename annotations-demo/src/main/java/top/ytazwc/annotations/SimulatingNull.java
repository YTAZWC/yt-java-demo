package top.ytazwc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title SimulatingNull
 * @date 2024/5/27 22:48
 * @package top.ytazwc.annotations
 * @description 编译器对于元素的默认值有些过于挑剔。
 * 首先，元素不能有不确定的值。也就是说，元素要么有默认值，要么就在使用注解时提供元素的值。
 * 任何非基本类型的元素， 无论是在源代码声明时还是在注解接口中定义默认值时，都不能使用 null 作为其值。
 * 可以自定义一些特殊的值，比如空字符串或者负数用于表达某个元素不存在
 */
@Target(ElementType.METHOD) // 注解作用于方法
@Retention(RetentionPolicy.RUNTIME) // 注解运行时依然存在
public @interface SimulatingNull {
    int id() default -1;
    String description() default "";
}
