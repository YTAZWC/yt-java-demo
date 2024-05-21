package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title ConstructorException
 * @date 2024/5/20 22:25
 * @package top.ytazwc.exceptions
 * @description try-catch-resources 里 构造函数抛出异常
 */
public class ConstructorException {

    public static void main(String[] args) {
        try (
                First f = new First();
                SecondExcept s = new SecondExcept();
                Second s2 = new Second();
                ) {
            System.out.println("In body");
        } catch (CE e) {
            System.out.println("Caught: " + e);
        }
    }

}

class CE extends Exception {}

class SecondExcept extends Reporter {
    SecondExcept() throws CE {
        super();
        throw new CE();
    }
}
