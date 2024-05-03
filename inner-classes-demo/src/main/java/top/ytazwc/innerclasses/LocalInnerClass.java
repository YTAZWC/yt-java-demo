package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title LocalInnerClass
 * @date 2024/5/3 12:43
 * @package top.ytazwc.innerclasses
 * @description 局部内部类不能有访问说明符，因为它不是外部类的一部分
 * 但是它可以访问当前代码块内的常量，以及此外部类的所有成员
 * 为什么我们仍然使用局部内部类而不是匿名内部类呢？
 * 唯一的理由是，我们需要一个已命名的构造器，或者需要重载构造器
 * 而匿名内部类只能用于实例初始化。
 *
 * 所以使用局部内部类而不使用匿名内部类的另一个理由就是，需要不止一个该内部类的对象
 *
 */
public class LocalInnerClass {

    private int count = 0;
    Counter getCounter(final String name) {
        // A local inner class:
        class LocalCounter implements Counter {
            LocalCounter() {
                // Local inner class can have a constructor
                System.out.println("LocalCounter()");
            }
            @Override
            public int next() {
                System.out.print(name); // Access local final
                return count++;
            }
        }
        return new LocalCounter();
    }
    // Repeat, but with an anonymous inner class:
    Counter getCounter2(final String name) {
        return new Counter() {
            // Anonymous inner class cannot have a named
            // constructor, only an instance initializer:
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.print(name); // Access local final
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for(int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }

}

interface Counter {
    int next();
}
