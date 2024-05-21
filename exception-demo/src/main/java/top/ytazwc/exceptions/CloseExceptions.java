package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title CloseExceptions
 * @date 2024/5/20 22:35
 * @package top.ytazwc.exceptions
 * @description 抛出异常的 close() 方法
 */
public class CloseExceptions {
    public static void main(String[] args) {
        try (
            First f = new First();
            Closer c = new Closer();
            Second s = new Second();
        ) {
            System.out.println("In body");
        } catch (CloseException e) {
            System.out.println("Caught: " + e);
        }
    }
}

class CloseException extends Exception {}

class Reporter2 implements AutoCloseable {
    String name = getClass().getSimpleName();

    Reporter2() {
        System.out.println("Creating " + name);
    }

    @Override
    public void close() throws CloseException {
        System.out.println("Closing " + name);
    }

}

class Closer extends Reporter2 {
    @Override
    public void close() throws CloseException {
        super.close();
        throw new CloseException();
    }
}
