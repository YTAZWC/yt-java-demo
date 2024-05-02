package top.ytazwc.filters;

/**
 * @author 花木凋零成兰
 * @title Filter
 * @date 2024/5/2 11:01
 * @package top.ytazwc.filters
 * @description TODO
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
