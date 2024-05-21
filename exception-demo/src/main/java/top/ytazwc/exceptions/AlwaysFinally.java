package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title AlwaysFinally
 * @date 2024/5/20 9:42
 * @package top.ytazwc.exceptions
 * @description 测试Finally总是被执行
 */
public class AlwaysFinally {

    public static void main(String[] args) {

        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException();
            } finally {
                System.out.println("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println("Caught FourException in 1st try block");
        } finally {
            System.out.println("finally in 1st try block");
        }

    }

}

class FourException extends Exception {}
