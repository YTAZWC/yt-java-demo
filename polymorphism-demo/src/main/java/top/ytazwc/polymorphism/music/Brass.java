package top.ytazwc.polymorphism.music;

/**
 * @author 花木凋零成兰
 * @title Brass
 * @date 2024/4/30 15:29
 * @package top.ytazwc.polymorphism.music
 * @description 黄铜
 */
public class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
}
