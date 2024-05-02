package top.ytazwc.interfaces;

/**
 * @author 花木凋零成兰
 * @title Implementation2
 * @date 2024/5/2 10:20
 * @package top.ytazwc.interfaces
 * @description TODO
 */
public class Implementation2 implements AnInterface{
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface i = new Implementation2();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }

}
