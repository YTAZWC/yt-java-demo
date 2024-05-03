package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title MultiNestingAccess
 * @date 2024/5/3 9:10
 * @package top.ytazwc.innerclasses
 * @description 一个内部类被嵌套多少层并不重要——它能透明地访问所有它所嵌入的外部类的所有成员
 */
public class MultiNestingAccess {

    public static void main(String[] args) {

        MNA mna = new MNA();
        // ".new"语法能产生正确的作用域，所以不必在调用构造器时限定类名
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }

}

class MNA {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}
