package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 花木凋零成兰
 * @title AtUnitExample5
 * @date 2024/5/30 10:48
 * @package top.ytazwc.annotations
 * @description 如果你的测试对象需要执行某些初始化工作，并且使用完成之后还需要执行清理工作
 * 那么可以选择使用 static 的 @TestObjectCleanup 方法
 * 当测试对象使用结束之后，该方法会为你执行清理工作。
 */
public class AtUnitExample5 {
    private String text;
    public AtUnitExample5(String text) {
        this.text = text;
    }
    @Override
    public String toString() { return text; }
    // @TestProperty
    static PrintWriter output;
    // @TestProperty
    static int counter;
    // @TestObjectCreate
    static AtUnitExample5 create() {
        String id = Integer.toString(counter++);
        try {
            output = new PrintWriter("Test" + id + ".txt");
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return new AtUnitExample5(id);
    }
    // @TestObjectCleanup
    static void cleanup(AtUnitExample5 tobj) {
        System.out.println("Running cleanup");
        output.close();
    }
    @Test
    boolean test1() {
        output.print("test1");
        return true;
    }
    @Test
    boolean test2() {
        output.print("test2");
        return true;
    }
    @Test
    boolean test3() {
        output.print("test3");
        return true;
    }
}
