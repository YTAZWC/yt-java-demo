package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title CleanupIdiom
 * @date 2024/5/20 17:41
 * @package top.ytazwc.exceptions
 * @description 在创建需要清理的对象之后, 立即进入一个try-finally语句块
 */
public class CleanupIdiom {
    public static void main(String[] args) {
        // 创建对象
        NeedsCleanup nc1 = new NeedsCleanup();
        // 关闭资源逻辑
        try {
            // ...
        } finally {
            nc1.dispose();
        }

        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc3.dispose();
            nc2.dispose();
        }

        // 尝试构造方法 发生异常时 需要进行处理
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            } finally {
              nc4.dispose();
            }

        } catch (ConstructionException e) {
            System.out.println(e);
        }

    }
}

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}
class ConstructionException extends Exception {

}

class NeedsCleanup2 extends NeedsCleanup {
    NeedsCleanup2() throws ConstructionException {}
}
