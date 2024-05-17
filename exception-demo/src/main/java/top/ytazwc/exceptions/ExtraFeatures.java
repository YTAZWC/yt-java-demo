package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title ExtraFeatures
 * @date 2024/5/15 22:24
 * @package top.ytazwc.exceptions
 * @description 自定义异常 添加额外的构造器和成员
 */
public class ExtraFeatures {

    public static void f() throws MyException2 {
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Originated int h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }

}

class MyException2 extends Exception {

    private int x;

    MyException2() {}

    MyException2(String msg) {
        super(msg);
    }

    MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}
