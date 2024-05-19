package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title OnOffSwitch
 * @date 2024/5/19 22:25
 * @package top.ytazwc.exceptions
 * @description TODO
 */
public class OnOffSwitch {

    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {

    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.on();
        }
    }

}
