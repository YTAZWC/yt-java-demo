package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title AnonymousConstructor
 * @date 2024/5/2 21:46
 * @package top.ytazwc.innerclasses
 * @description 通过实例初始化，就能够达到为匿名内部类创建一个构造器的效果
 */
public class AnonymousConstructor {

    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }

}

abstract class Base {
    Base (int i) {
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f ();
}
