package top.ytazwc.innerclasses.mui;

/**
 * @author 花木凋零成兰
 * @title MultiInterfaces
 * @date 2024/5/3 9:19
 * @package top.ytazwc.innerclasses.mui
 * @description 在一个类中以某种方式实现两个接口
 * 1. 使用单一类
 * 2. 使用内部类
 */
public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesB(x);

        takesA(y);
        takesB(y.makeB());
    }

}

interface A {

}

interface B {

}

class X implements A, B {

}

class Y implements A {
    // 匿名内部类
    B makeB() {
        return new B() {};
    }
}
