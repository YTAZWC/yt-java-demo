package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title BodyException
 * @date 2024/5/20 22:31
 * @package top.ytazwc.exceptions
 * @description 没有构造函数抛出异常，但你可能会在 try 的主体中获取它们
 */
public class BodyException {

    public static void main(String[] args) {

        try (
            First f = new First();
            Second s2 = new Second();
        ) {
            System.out.println("In body");
            Third t = new Third();
            new SecondExcept();
            System.out.println("End of body");
        } catch (CE e) {
            System.out.println("Caught: " + e);
        }

    }

}

class Third extends Reporter {}
