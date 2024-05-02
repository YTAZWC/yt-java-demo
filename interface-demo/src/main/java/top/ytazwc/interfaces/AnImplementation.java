package top.ytazwc.interfaces;

/**
 * @author 花木凋零成兰
 * @title AnImplementation
 * @date 2024/5/2 10:16
 * @package top.ytazwc.interfaces
 * @description TODO
 */
public class AnImplementation implements AnInterface {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface i = new AnImplementation();
        i.firstMethod();
        i.secondMethod();
    }
}
