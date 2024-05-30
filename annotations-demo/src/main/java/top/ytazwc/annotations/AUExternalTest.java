package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

/**
 * @author 花木凋零成兰
 * @title AUExternalTest
 * @date 2024/5/29 23:03
 * @package top.ytazwc.annotations
 * @description TODO
 */
public class AUExternalTest extends AtUnitExample1 {
    @Test
    boolean _MethodOne() {
        return "This is methodOne".equals(methodOne());
    }
    @Test
    boolean _MethodTwo() {
        return methodTwo() == 2;
    }
}
