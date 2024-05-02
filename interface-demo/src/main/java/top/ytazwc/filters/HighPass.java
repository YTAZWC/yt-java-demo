package top.ytazwc.filters;

/**
 * @author 花木凋零成兰
 * @title HighPass
 * @date 2024/5/2 11:02
 * @package top.ytazwc.filters
 * @description TODO
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
