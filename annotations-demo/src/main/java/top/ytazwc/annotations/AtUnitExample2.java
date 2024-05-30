package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 花木凋零成兰
 * @title AtUnitExample2
 * @date 2024/5/29 23:19
 * @package top.ytazwc.annotations
 * @description Assertions and exceptions can be used in @Tests
 */
public class AtUnitExample2 {
    public String methodOne() {
        return "This is methodOne";
    }
    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }
    @Test
    void assertExample() {
        assert "This is methodOne".equals(methodOne());
    }
    @Test
    void assertFailureExample() {
        assert 1 == 2: "What a surprise!";
    }

    @Test
    void exceptionExample() throws IOException {
        try (
                FileInputStream fis = new FileInputStream("nofile.txt")
        ) {

        } // Throws
    }
    @Test
    boolean assertAndReturn() {
        // Assertion with message:
        assert methodTwo() == 2: "methodTwo must equal 2";
        return "This is methodOne".equals(methodOne());
    }

}
