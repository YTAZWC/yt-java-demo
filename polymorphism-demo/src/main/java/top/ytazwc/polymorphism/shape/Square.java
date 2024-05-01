package top.ytazwc.polymorphism.shape;

/**
 * @author 花木凋零成兰
 * @title Square
 * @date 2024/4/30 16:13
 * @package top.ytazwc.polymorphism.shape
 * @description 方形
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
