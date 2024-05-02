package top.ytazwc.interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title RandomStrings
 * @date 2024/5/2 13:43
 * @package top.ytazwc.interfaces
 * @description 接口适配
 */
public class RandomStrings implements Readable {

    private static Random rand = new Random(47);
    private static final char[] CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] LOWERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] VOWELS = "aeiou".toCharArray();
    private int count;

    public RandomStrings(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            // indicates end of input
            return -1;
        }
        cb.append(CAPITALS[rand.nextInt(CAPITALS.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(VOWELS[rand.nextInt(VOWELS.length)]);
            cb.append(LOWERS[rand.nextInt(LOWERS.length)]);
        }
        cb.append(" ");
        // Number of characters appended
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomStrings(12));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }

}
