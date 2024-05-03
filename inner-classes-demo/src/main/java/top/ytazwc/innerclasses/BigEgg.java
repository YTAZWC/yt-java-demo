package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title BigEgg
 * @date 2024/5/3 11:20
 * @package top.ytazwc.innerclasses
 * @description 内部类可以被覆盖么
 */
public class BigEgg extends Egg {

    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }

}

class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
    Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}