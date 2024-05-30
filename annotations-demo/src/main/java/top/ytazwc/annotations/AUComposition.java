package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

/**
 * @author 花木凋零成兰
 * @title AUComposition
 * @date 2024/5/29 23:10
 * @package top.ytazwc.annotations
 * @description 使用组合来创建非嵌入式的测试
 */
public class AUComposition {
    AtUnitExample1 testObject = new AtUnitExample1();
    @Test
    boolean tMethodOne() {
        return "This is methodOne".equals(testObject.methodOne());
    }
    @Test
    boolean tMethodTwo() {
        return testObject.methodTwo() == 2;
    }
}
