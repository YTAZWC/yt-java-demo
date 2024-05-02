package top.ytazwc.filters;

/**
 * @author 花木凋零成兰
 * @title LowPass
 * @date 2024/5/2 11:01
 * @package top.ytazwc.filters
 * @description TODO
 */
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        // Dummy processing 哑处理
        return input;
    }
}
