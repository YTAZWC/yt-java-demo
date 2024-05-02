package top.ytazwc.interfaceprocessor;

/**
 * @author 花木凋零成兰
 * @title Processor
 * @date 2024/5/2 11:05
 * @package top.ytazwc.interfaceprocessor
 * @description TODO
 */
public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}
