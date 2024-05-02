package top.ytazwc;

import java.util.Random;

/**
 * @author 花木凋零成兰
 * @title RandValues
 * @date 2024/5/2 14:04
 * @package top.ytazwc
 * @description 接口字段
 */
public interface RandValues {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
