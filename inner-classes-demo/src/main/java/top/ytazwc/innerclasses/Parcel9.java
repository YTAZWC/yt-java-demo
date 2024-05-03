package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Parcel9
 * @date 2024/5/2 21:44
 * @package top.ytazwc.innerclasses
 * @description 在匿名类中定义字段时，还能够对其执行初始化操作
 */
public class Parcel9 {

    // 如果定义一个匿名内部类，并且希望它使用一个在其外部定义的对象
    // 那么编译器会要求其参数引用是 final 的
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() { return label; }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }

}
