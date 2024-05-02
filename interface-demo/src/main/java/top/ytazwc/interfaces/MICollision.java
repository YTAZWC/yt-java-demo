package top.ytazwc.interfaces;

/**
 * @author 花木凋零成兰
 * @title MICollision
 * @date 2024/5/2 10:26
 * @package top.ytazwc.interfaces
 * @description TODO
 */
public class MICollision {
}
interface Bob1 {
    default void bob() {
        System.out.println("Bob1::bob");
    }
}

interface Bob2 {
    default void bob() {
        System.out.println("Bob2::bob");
    }
}
interface Sam1 {
    default void sam() {
        System.out.println("Sam1::sam");
    }
}

interface Sam2 {
    default void sam(int i) {
        System.out.println(i * 2);
    }
}

class Sam implements Sam1, Sam2 {}

interface Max1 {
    default void max() {
        System.out.println("Max1::max");
    }
}
interface Max2 {
    default int max() {
        return 47;
    }
}