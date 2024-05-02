package top.ytazwc.interfaces;

/**
 * @author 花木凋零成兰
 * @title AnInterface
 * @date 2024/5/2 10:15
 * @package top.ytazwc.interfaces
 * @description TODO
 */
public interface AnInterface {
    void firstMethod();
    void secondMethod();

    default void newMethod() {
        System.out.println("newMethod");
    }
}
