package top.ytazwc.annotations.onjava.atunit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 花木凋零成兰
 * @title Test
 * @date 2024/5/27 17:52
 * @package top.ytazwc.annotations.onjava.atunit
 * @description 自定义注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}
