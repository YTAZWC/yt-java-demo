package top.ytazwc.polymorphism.music;

/**
 * @author 花木凋零成兰
 * @title Stringed
 * @date 2024/4/30 15:28
 * @package top.ytazwc.polymorphism.music
 * @description 弦乐
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}
