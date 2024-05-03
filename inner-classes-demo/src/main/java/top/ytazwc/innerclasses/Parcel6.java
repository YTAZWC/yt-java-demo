package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Parcel6
 * @date 2024/5/2 21:33
 * @package top.ytazwc.innerclasses
 * @description 在任意的作用域内嵌入一个内部类
 */
public class Parcel6 {

    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;
                // 内部类的构造方法
                TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }
    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }

}
