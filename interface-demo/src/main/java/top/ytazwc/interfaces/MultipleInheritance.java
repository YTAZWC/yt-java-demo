package top.ytazwc.interfaces;

/**
 * @author 花木凋零成兰
 * @title MultipleInheritance
 * @date 2024/5/2 10:23
 * @package top.ytazwc.interfaces
 * @description TODO
 */
public class MultipleInheritance {

    public static void main(String[] args) {
        MI mi = new MI();
        mi.first();
        mi.second();
        mi.third();
    }

}
interface One {
    default void first() {
        System.out.println("first");
    }
}

interface Two {
    default void second() {
        System.out.println("second");
    }
}

interface Three {
    default void third() {
        System.out.println("third");
    }
}

class MI implements One, Two, Three {}
