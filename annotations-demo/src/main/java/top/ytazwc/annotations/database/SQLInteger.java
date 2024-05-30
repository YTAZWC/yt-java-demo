package top.ytazwc.annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title SQLInteger
 * @date 2024/5/27 23:02
 * @package top.ytazwc.annotations.database
 * @description 修饰字段 Integer类型
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {
    /**
     * 设置Integer类型字段名
     * @return 字段名
     */
    String name() default "";
    // 嵌套注解
    Constraints constraints() default @Constraints;
}
