package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title AutoCloseableDetails
 * @date 2024/5/20 22:09
 * @package top.ytazwc.exceptions
 * @description 创建自己的AutoCloseable类
 */
public class AutoCloseableDetails {

    public static void main(String[] args) {
        try (
            First f = new First();
            Second s = new Second();
        ) {

        }
    }

}

class Reporter implements AutoCloseable {

    String name = getClass().getSimpleName();

    Reporter() {
        System.out.println("Creating " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing " + name);
    }
}

class First extends Reporter {}

class Second extends Reporter {}
