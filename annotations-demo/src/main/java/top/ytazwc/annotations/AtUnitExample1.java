package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

/**
 * @author 花木凋零成兰
 * @title AtUnitExample1
 * @date 2024/5/29 22:50
 * @package top.ytazwc.annotations
 * @description 测试@Unit注解
 */
public class AtUnitExample1 {
    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test
    boolean methodOneTest() {
        return "This is methodOne".equals(methodOne());
    }

    @Test
    boolean m2() {
        return methodTwo() == 2;
    }

    @Test
    private boolean m3() {
        return true;
    }

    @Test
    boolean failureTest() {
        return false;
    }

    @Test
    boolean anotherDisappointment() {
        return false;
    }
}
