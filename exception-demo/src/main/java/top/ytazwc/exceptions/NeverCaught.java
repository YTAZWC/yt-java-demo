package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title NeverCaught
 * @date 2024/5/19 21:58
 * @package top.ytazwc.exceptions
 * @description 测试RuntimeException类型的异常
 */
public class NeverCaught {

    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }

}
