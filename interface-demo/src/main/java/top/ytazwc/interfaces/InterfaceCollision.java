package top.ytazwc.interfaces;

/**
 * @author 花木凋零成兰
 * @title InterfaceCollision
 * @date 2024/5/2 11:49
 * @package top.ytazwc.interfaces
 * @description 结合接口时的命名冲突
 */
public class InterfaceCollision {
}

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    @Override
    public void f() {

    }

    // 重载
    @Override
    public int f(int i) {
        return 0;
    }
}

class C3 extends C implements I2 {
    // 重载
    @Override
    public int f(int i) {
        return 1;
    }
}

class C4 extends C implements I3 {
    @Override
    public int f() {
        return super.f();
    }
}



