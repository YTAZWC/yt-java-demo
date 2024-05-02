package top.ytazwc.interfaceprocessor;

import java.util.Arrays;

/**
 * @author 花木凋零成兰
 * @title StringProcessor
 * @date 2024/5/2 11:10
 * @package top.ytazwc.interfaceprocessor
 * @description TODO
 */
public interface StringProcessor extends Processor {

    // [1] 声明不是必要的，即使移除它，编译器也不会报错。但是注意这里的协变返回类型从 Object 变成了 String
    @Override
    String process(Object input);
    // [2] S 自动就是 final 和 static 的，因为它是在接口中定义的
    String S = "If she weighs the same as a duck, she's made of wood";

    // [3] 可以在接口中定义 main() 方法
    static void main(String[] args) {
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }

}
class Upcase implements StringProcessor {
    // 返回协变类型
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
