package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title Human
 * @date 2024/5/20 22:47
 * @package top.ytazwc.exceptions
 * @description 查找的时候并不要求抛出的异常同处理程序所声明的异常完全匹配
 * 派生类的对象也可以匹配其基类的处理程序
 */
public class Human {

    public static void main(String[] args) {

        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }

    }

}

class Annoyance extends Exception {}

class Sneeze extends Annoyance {}
