package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Parcel7
 * @date 2024/5/2 21:38
 * @package top.ytazwc.innerclasses
 * @description 匿名内部类
 */
public class Parcel7 {
    public Contents contents() {
        // Insert class definition
        // 创建一个继承自 Contents 的匿名类的对象
        return new Contents() {
            private int i = 11;

            @Override
            public int value() { return i; }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }

}
