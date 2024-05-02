package top.ytazwc.interfaceprocessor;

import top.ytazwc.filters.*;

/**
 * @author 花木凋零成兰
 * @title FilterProcessor
 * @date 2024/5/2 11:13
 * @package top.ytazwc.interfaceprocessor
 * @description TODO
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
        Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}

// 设配器设计模式
class FilterAdapter implements Processor {
    Filter filter;

    FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
