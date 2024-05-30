package top.ytazwc.annotations.ifx;

/**
 * @author 花木凋零成兰
 * @title Multiplier
 * @date 2024/5/29 13:50
 * @package top.ytazwc.annotations.ifx
 * @description @ExtractInterface接口测试类
 */
@ExtractInterface(interfaceName = "IMultiplier")
public class Multiplier {
    public boolean flag = false;
    private int n = 0;

    public int multiplier(int x, int y) {
        int total = 0;
        for (int i = 0; i < x; i++) {
            total = add(total, y);
        }
        return total;
    }

    public int fortySeven() {
        return 47;
    }

    private int add(int x, int y) {
        return x + y;
    }

    public double timesTen(double arg) {
        return arg * 10;
    }

    public static void main(String[] args) {

        Multiplier multiplier = new Multiplier();
        System.out.println("11 * 16 = " + multiplier.multiplier(11, 6));

    }


}
