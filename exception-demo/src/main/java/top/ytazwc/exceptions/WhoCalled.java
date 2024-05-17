package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title WhoCalled
 * @date 2024/5/17 20:25
 * @package top.ytazwc.exceptions
 * @description 方法的栈轨迹
 */
public class WhoCalled {

    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("************");
        g();
        System.out.println("************");
        h();
    }

}
