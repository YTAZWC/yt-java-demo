package top.ytazwc.test;

/**
 * @author 花木凋零成兰
 * @title Instantiable
 * @date 2024/5/2 9:06
 * @package top.ytazwc.test
 * @description TODO
 */
public class Instantiable extends Uninstantiable {
    @Override
    void f() {

    }

    @Override
    int g() {
        return 0;
    }

    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
    }
}
