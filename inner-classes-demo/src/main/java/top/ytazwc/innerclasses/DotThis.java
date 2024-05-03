package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title DotThis
 * @date 2024/5/2 17:26
 * @package top.ytazwc.innerclasses
 * @description 使用.this 生成外部类对象的引用
 * 如果你需要生成对外部类对象的引用，可以使用外部类的名字后面紧跟圆点和 this
 * 这样产生的引用自动地具有正确的类型，这一点在编译期就被知晓并受到检查
 * 因此没有任何运行时开销
 */
public class DotThis {

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }

}
