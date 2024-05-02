package top.ytazwc.interfaceprocessor;

/**
 * @author 花木凋零成兰
 * @title Applicator
 * @date 2024/5/2 11:05
 * @package top.ytazwc.interfaceprocessor
 * @description TODO
 */
public class Applicator {
    public static void apply(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
