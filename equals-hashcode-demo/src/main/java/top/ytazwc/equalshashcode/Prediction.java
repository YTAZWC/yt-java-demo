package top.ytazwc.equalshashcode;

import java.util.Random;

/**
 * @author 花木凋零成兰
 * @title Prediction
 * @date 2024/5/4 22:33
 * @package top.ytazwc.equalshashcode
 * @description Predicting the weather
 */
public class Prediction {
    private static Random rand = new Random(47);
    @Override
    public String toString() {
        return rand.nextBoolean() ?
                "Six more weeks of Winter!" : "Early Spring!";
    }
}
