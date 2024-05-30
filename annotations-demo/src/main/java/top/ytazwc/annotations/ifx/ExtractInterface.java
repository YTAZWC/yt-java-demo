package top.ytazwc.annotations.ifx;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title ExtractInterface
 * @date 2024/5/29 13:47
 * @package top.ytazwc.annotations.ifx
 * @description 用于提取类中方法的注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
    String interfaceName() default "-!!-";
}
