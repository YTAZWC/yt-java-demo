package top.ytazwc.innerclasses.mui;

/**
 * @author 花木凋零成兰
 * @title MultiImplementation
 * @date 2024/5/3 9:23
 * @package top.ytazwc.innerclasses.mui
 * @description 拥有的是抽象的类或具体的类，而不是接口，那就只能使用内部类才能实现多重继承
 */
public class MultiImplementation {

    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }

}

class D {}

abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}