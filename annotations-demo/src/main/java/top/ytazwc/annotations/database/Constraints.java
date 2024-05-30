package top.ytazwc.annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title Constraints
 * @date 2024/5/27 22:56
 * @package top.ytazwc.annotations.database
 * @description 告诉处理器创建的数据库表应该有的字段
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
    /**
     * 字段是否为主键
     * @return true为是 默认不是
     */
    boolean primaryKey() default false;

    /**
     * 字段是否可为空
     * @return 默认true是 false不是
     */
    boolean allowNull() default true;

    /**
     * 字段值是否唯一
     * @return 默认false不是 true是
     */
    boolean unique() default false;
}
