package top.ytazwc.polymorphism.shape;

import java.util.Random;

/**
 * @author 花木凋零成兰
 * @title RandomShapes
 * @date 2024/4/30 16:17
 * @package top.ytazwc.polymorphism.shape
 * @description 随机产生一个图形 工厂
 */
public class RandomShapes {

    private final Random rand = new Random(47);

    // 随机获取一个Shape对象
    public Shape get() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    public Shape[] array(int sz) {
        Shape[] shapes = new Shape[sz];
        // 给数组赋初始值
        for (int i = 0; i < shapes.length; ++ i) {
            shapes[i] = get();
        }
        return shapes;
    }

}
