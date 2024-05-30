package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

/**
 * @author 花木凋零成兰
 * @title Testable
 * @date 2024/5/27 17:51
 * @package top.ytazwc.annotations
 * @description TODO
 */
public class Testable {
    public void execute() {
        System.out.println("Executing ... ");
    }
    @Test
    void testExecute() {
        execute();
    }
}
