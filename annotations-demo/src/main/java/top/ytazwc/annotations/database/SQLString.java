package top.ytazwc.annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title SQLString
 * @date 2024/5/27 22:59
 * @package top.ytazwc.annotations.database
 * @description 修饰字段 String类型
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
    /**
     * 确定String类型字段在数据库表中的长度
     * @return 字段长度
     */
    int value() default 0;
    /**
     * 设置String类型字段名
     * @return 字段名
     */
    String name() default "";
    Constraints constraints() default @Constraints;
}
