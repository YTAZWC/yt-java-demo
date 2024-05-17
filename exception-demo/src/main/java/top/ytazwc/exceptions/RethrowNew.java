package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title RethrowNew
 * @date 2024/5/17 22:22
 * @package top.ytazwc.exceptions
 * @description 捕获异常后抛出另一种异常
 */
public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("origination the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}

class OneException extends Exception {
    OneException(String s) {
        super(s);
    }
}
class TwoException extends Exception {
    TwoException(String s) {
        super(s);
    }
}
