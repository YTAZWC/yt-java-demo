package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Parcel11
 * @date 2024/5/2 21:59
 * @package top.ytazwc.innerclasses
 * @description 嵌套类
 */
public class Parcel11 {

    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static final class ParcelDestination implements Destination {
        private String label;
        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }

}
