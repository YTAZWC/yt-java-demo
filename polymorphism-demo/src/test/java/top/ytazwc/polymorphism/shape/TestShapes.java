package top.ytazwc.polymorphism.shape;

/**
 * @author 花木凋零成兰
 * @title TestShapes
 * @date 2024/4/30 16:51
 * @package top.ytazwc.polymorphism.shape
 * @description TODO
 */
public class TestShapes {

    public static void main(String[] args) {

        RandomShapes  gen = new RandomShapes();
        for (Shape shape : gen.array(9)) {
            shape.draw();
        }

    }

}
