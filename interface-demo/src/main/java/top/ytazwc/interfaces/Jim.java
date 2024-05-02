package top.ytazwc.interfaces;

/**
 * @author 花木凋零成兰
 * @title Jim
 * @date 2024/5/2 10:30
 * @package top.ytazwc.interfaces
 * @description TODO
 */
public class Jim implements Jim1, Jim2 {
    @Override
    public void jim() {
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}
