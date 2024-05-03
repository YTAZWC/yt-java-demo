package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Parcel2
 * @date 2024/5/2 16:32
 * @package top.ytazwc.innerclasses
 * @description 外部类有一个方法 返回一个指向内部类的引用
 */
public class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() { return i; }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() { return label; }
    }

    // 返回 Destination 对象
    public Destination to(String s) {
        return new Destination(s);
    }

    // 返回 Contents 对象
    public Contents contents() {
        return new Contents();
    }
    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }

}
