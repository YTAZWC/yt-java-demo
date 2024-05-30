package top.ytazwc.annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title DBTable
 * @date 2024/5/27 22:53
 * @package top.ytazwc.annotations.database
 * @description 告诉注解处理器应该创建一个数据库表
 */
@Target(ElementType.TYPE)   // 作用于类
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    /**
     * 创建的数据库表名
     * @return 返回表名
     */
    String name() default "";
}
