package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title MultiCatch
 * @date 2024/5/16 23:33
 * @package top.ytazwc.exceptions
 * @description java7的多重捕获机制
 */
public class MultiCatch {
    void x() throws Except1, Except2, Except3, Except4 {}
    void process() {}
    void f() {
        try {
            x();

        } catch(Except1 | Except2 | Except3 | Except4 e) {
            process();
        }
    }
}
