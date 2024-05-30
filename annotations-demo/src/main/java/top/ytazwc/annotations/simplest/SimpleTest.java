package top.ytazwc.annotations.simplest;

/**
 * @author 花木凋零成兰
 * @title SimpleTest
 * @date 2024/5/28 21:41
 * @package top.ytazwc.annotations.simplest
 * @description 测试注解@Simple
 */
@Simple
public class SimpleTest {
    @Simple
    int i;

    @Simple
    public SimpleTest() {

    }

    @Simple
    public void foo() {
        System.out.println("SimpleTest.foo()...");
    }

    @Simple
    public void bar(String s, int i, float f) {
        System.out.println("SimpleTest.bar()...");
    }

    @Simple
    public static void main(String[] args) {
        @Simple SimpleTest st = new SimpleTest();
        st.foo();
    }
}
