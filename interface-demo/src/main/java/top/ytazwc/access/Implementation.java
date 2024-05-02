package top.ytazwc.access;

/**
 * @author 花木凋零成兰
 * @title Implementation
 * @date 2024/5/2 10:11
 * @package top.ytazwc.access
 * @description TODO
 */
public class Implementation implements Concept {
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}

interface Concept {
    void idea1();
    void idea2();
}
