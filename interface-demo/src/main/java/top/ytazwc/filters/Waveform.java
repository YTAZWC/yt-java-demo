package top.ytazwc.filters;

/**
 * @author 花木凋零成兰
 * @title Waveform
 * @date 2024/5/2 11:00
 * @package top.ytazwc.filters
 * @description TODO
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
