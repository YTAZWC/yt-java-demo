package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

/**
 * @author 花木凋零成兰
 * @title AtUnitExample3
 * @date 2024/5/30 10:25
 * @package top.ytazwc.annotations
 * @description 类没有默认构造器，或者对象需要复杂的构造过程
 * 那么你可以创建一个 static 方法专门负责构造对象，然后使用 @TestObjectCreate 注解标记该方法
 */
public class AtUnitExample3 {
    private int n;

    public AtUnitExample3(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    //@TestObjectCreate
    static AtUnitExample3 create() {
        return new AtUnitExample3(47);
    }

    @Test
    boolean initialization() {
        return n == 47;
    }

    @Test
    boolean methodOneTest() {
        return "This is methodOne".equals(methodOne());
    }

    @Test
    boolean m2() {
        return methodTwo() == 2;
    }
}
