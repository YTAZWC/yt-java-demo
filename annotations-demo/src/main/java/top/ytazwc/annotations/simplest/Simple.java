package top.ytazwc.annotations.simplest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title Simple
 * @date 2024/5/28 21:36
 * @package top.ytazwc.annotations.simplest
 * @description TODO
 */
@Retention(RetentionPolicy.SOURCE)  // 注解只在源文件有效 即注解不会存留在编译后的代码
@Target({   // 声明注解可作用位置
        ElementType.TYPE, ElementType.METHOD,
        ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE,
        ElementType.PACKAGE, ElementType.FIELD,
        ElementType.LOCAL_VARIABLE
})
public @interface Simple {
    String value() default "-default-";
}
