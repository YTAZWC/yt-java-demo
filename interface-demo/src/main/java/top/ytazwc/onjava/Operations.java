package top.ytazwc.onjava;

/**
 * @author 花木凋零成兰
 * @title Operations
 * @date 2024/5/2 10:33
 * @package top.ytazwc.onjava
 * @description TODO
 */
public interface Operations {
    void execute();

    // 模板方法 私用可变参数类列表
    static void runOps(Operations... ops) {
        for (Operations op: ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}
