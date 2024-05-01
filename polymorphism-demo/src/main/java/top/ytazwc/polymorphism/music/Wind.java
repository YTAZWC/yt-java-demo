package top.ytazwc.polymorphism.music;

/**
 * @author 花木凋零成兰
 * @title Wind
 * @date 2024/4/30 15:22
 * @package top.ytazwc.polymorphism.music
 * @description 风
 */
public class Wind extends Instrument {
    // 重写父类方法
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
