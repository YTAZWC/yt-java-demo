package top.ytazwc.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title AdaptedRandomDoubles
 * @date 2024/5/2 13:51
 * @package top.ytazwc.interfaces
 * @description 随机产生浮点数适配器
 */
public class AdaptedRandomDoubles implements RandomDoubles, Readable {

    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.print(s.nextDouble() + " ");
        }
    }

}
