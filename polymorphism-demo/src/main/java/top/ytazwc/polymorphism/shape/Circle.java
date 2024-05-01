package top.ytazwc.polymorphism.shape;

/**
 * @author 花木凋零成兰
 * @title Circle
 * @date 2024/4/30 16:13
 * @package top.ytazwc.polymorphism.shape
 * @description 圆形
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
