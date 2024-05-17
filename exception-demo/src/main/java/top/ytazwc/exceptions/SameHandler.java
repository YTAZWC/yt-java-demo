package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title SameHandler
 * @date 2024/5/16 23:23
 * @package top.ytazwc.exceptions
 * @description 多重捕获 java7之前
 */
public class SameHandler {
    void x() throws Except1, Except2, Except3, Except4 {}
    void process() {}
    void f() {
        try {
            x();
        } catch (Except1 e) {
            process();
        } catch (Except2 e) {
            process();
        } catch (Except3 e) {
            process();
        } catch (Except4 e) {
            process();
        }
    }
}
class EBase1 extends Exception {}
class Except1 extends EBase1 {}
class EBase2 extends Exception {}
class Except2 extends EBase2 {}
class EBase3 extends Exception {}
class Except3 extends EBase3 {}
class EBase4 extends Exception {}
class Except4 extends EBase4 {}