package top.ytazwc.polymorphism.shape;

/**
 * @author 花木凋零成兰
 * @title Triangle
 * @date 2024/4/30 16:14
 * @package top.ytazwc.polymorphism.shape
 * @description 三角形
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
