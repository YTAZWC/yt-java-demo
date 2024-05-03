package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title ClassInInterface
 * @date 2024/5/3 9:06
 * @package top.ytazwc.innerclasses
 * @description 嵌套类可以作为接口的一部分
 */
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
