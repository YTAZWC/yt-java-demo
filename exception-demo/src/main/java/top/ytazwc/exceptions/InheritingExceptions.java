package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title InheritingExceptions
 * @date 2024/5/15 20:55
 * @package top.ytazwc.exceptions
 * @description 创建自己的异常类
 */
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException form f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}

class SimpleException extends Exception {

}
