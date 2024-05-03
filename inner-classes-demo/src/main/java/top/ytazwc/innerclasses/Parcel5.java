package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Parcel5
 * @date 2024/5/2 21:28
 * @package top.ytazwc.innerclasses
 * @description 方法中的内部类
 */
public class Parcel5 {
    public Destination destination(String s) {
        final class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        // 向上转型-返回的是 Destination 的引用
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }

}
