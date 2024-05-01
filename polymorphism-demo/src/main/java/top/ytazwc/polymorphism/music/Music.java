package top.ytazwc.polymorphism.music;

/**
 * @author 花木凋零成兰
 * @title Music
 * @date 2024/4/30 15:25
 * @package top.ytazwc.polymorphism.music
 * @description 音乐
 */
public class Music {

    // 接收Instrument的引用 及其派生自Instrument的引用
    public static void tune(Instrument i) {
        // 调用play方法
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }

}
