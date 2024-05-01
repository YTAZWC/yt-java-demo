package top.ytazwc.polymorphism.music;

/**
 * @author 花木凋零成兰
 * @title Music2
 * @date 2024/4/30 15:30
 * @package top.ytazwc.polymorphism.music
 * @description 假设不使用向上转型
 */
public class Music2 {

    // 风发出声音
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    // 弦乐发出声音
    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    // 黄铜发出声音
    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }

}
