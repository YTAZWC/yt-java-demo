package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title FullConstructors
 * @date 2024/5/15 21:03
 * @package top.ytazwc.exceptions
 * @description 异常类 有一个接收字符串参数的构造器
 */
public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Throwing MyException form f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException form g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

    }

}

class MyException extends Exception {

    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }

}
