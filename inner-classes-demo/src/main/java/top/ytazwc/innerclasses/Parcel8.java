package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Parcel8
 * @date 2024/5/2 21:41
 * @package top.ytazwc.innerclasses
 * @description 匿名内部类中 基类需要一个有参数的构造器
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        // Base constructor call:
        // [1] 将合适的参数传递给基类的构造器
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // [2] 匿名内部类末尾的分号，并不是用来标记此内部类结束的 标记的是表达式的结束
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
