package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title FinallyWorks
 * @date 2024/5/19 22:01
 * @package top.ytazwc.exceptions
 * @description The finally clause is always executed
 */
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count ++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No Exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");
                if (count == 2) {
                    break;
                }
            }
        }
    }
}

class ThreeException extends Exception {}
