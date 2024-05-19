package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title Switch
 * @date 2024/5/19 22:16
 * @package top.ytazwc.exceptions
 * @description 开关类
 */
public class Switch {

    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}