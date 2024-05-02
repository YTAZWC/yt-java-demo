package top.ytazwc.filters;

/**
 * @author 花木凋零成兰
 * @title BandPass
 * @date 2024/5/2 11:02
 * @package top.ytazwc.filters
 * @description TODO
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
