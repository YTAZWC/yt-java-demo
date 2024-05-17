package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title ExceptionMethods
 * @date 2024/5/16 12:31
 * @package top.ytazwc.exceptions
 * @description 测试异常类的方法
 */
public class ExceptionMethods {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }

}
