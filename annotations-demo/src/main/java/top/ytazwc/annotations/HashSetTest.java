package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

import java.util.HashSet;

/**
 * @author 花木凋零成兰
 * @title HashSetTest
 * @date 2024/5/29 23:22
 * @package top.ytazwc.annotations
 * @description 是一个使用非嵌入式测试的例子
 * 并且使用了断言 它将会对 java.util.HashSet 进行一些简单的测试
 */
public class HashSetTest {
    HashSet<String> testObject = new HashSet<>();

    @Test
    void initialization() {
        assert testObject.isEmpty();
    }
    @Test
    void _Contains() {
        testObject.add("one");
        assert testObject.contains("one");
    }
    @Test
    void _Remove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
    }
}
