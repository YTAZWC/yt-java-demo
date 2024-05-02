package top.ytazwc.interfaces;

import java.util.Random;

/**
 * @author 花木凋零成兰
 * @title RandomDoubles
 * @date 2024/5/2 13:49
 * @package top.ytazwc.interfaces
 * @description 随机产生浮点数
 */
public interface RandomDoubles {

    Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles() {
        };
        for (int i = 0; i < 7; ++ i) {
            System.out.println(rd.next() + " ");
        }
    }

}
