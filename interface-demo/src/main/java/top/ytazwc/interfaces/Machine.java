package top.ytazwc.interfaces;

import top.ytazwc.onjava.Operations;

/**
 * @author 花木凋零成兰
 * @title Machine
 * @date 2024/5/2 10:33
 * @package top.ytazwc.interfaces
 * @description TODO
 */
public class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(), new Crack(), new Twist()
        );
    }
}

class Bing implements Operations {
    @Override
    public void execute() {
        Operations.show("Bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }
}
