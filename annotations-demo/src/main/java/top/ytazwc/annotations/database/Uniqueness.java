package top.ytazwc.annotations.database;

/**
 * @author 花木凋零成兰
 * @title Uniqueness
 * @date 2024/5/27 23:06
 * @package top.ytazwc.annotations.database
 * @description 修饰字段 表示字段值唯一
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
