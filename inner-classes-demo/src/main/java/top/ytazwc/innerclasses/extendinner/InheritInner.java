package top.ytazwc.innerclasses.extendinner;

/**
 * @author 花木凋零成兰
 * @title InheritInner
 * @date 2024/5/3 11:15
 * @package top.ytazwc.innerclasses.extendinner
 * @description 继承内部类
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }
}

class WithInner {
    class Inner {}
}
