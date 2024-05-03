package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title Wrapping
 * @date 2024/5/2 21:42
 * @package top.ytazwc.innerclasses
 * @description 只是一个具有具体实现的普通类 被导出类当作公共“接口”来使用
 */
public class Wrapping {
    private int i;
    public Wrapping(int x) { i = x; }
    public int value() { return i; }
}
