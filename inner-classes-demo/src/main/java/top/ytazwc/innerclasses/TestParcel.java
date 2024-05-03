package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title TestParcel
 * @date 2024/5/2 21:05
 * @package top.ytazwc.innerclasses
 * @description 内部类与向上转型 测试类
 */
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        System.out.println(c.value());
    }
}

// 内部类
class Parcel4 {

    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected final class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

}
