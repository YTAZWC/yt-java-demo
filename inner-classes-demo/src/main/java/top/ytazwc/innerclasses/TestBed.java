package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title TestBed
 * @date 2024/5/3 9:08
 * @package top.ytazwc.innerclasses
 * @description 使用嵌套类来放置测试代码
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }

}
