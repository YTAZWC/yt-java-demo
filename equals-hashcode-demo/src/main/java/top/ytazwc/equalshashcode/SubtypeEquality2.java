package top.ytazwc.equalshashcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 花木凋零成兰
 * @title SubtypeEquality2
 * @date 2024/5/4 22:24
 * @package top.ytazwc.equalshashcode
 * @description 通过标准方式，将 equals() 定义在子类中
 */
public class SubtypeEquality2 {
    public static void main(String[] args) {
        Set<Animal> pets = new HashSet<>();
        pets.add(new Dog2("Ralph", Size.MEDIUM));
        pets.add(new Pig2("Ralph", Size.MEDIUM));
        pets.forEach(System.out::println);
    }

}
class Dog2 extends Animal {
    Dog2(String name, Size size) {
        super(name, size);
    }

    @Override
    public boolean equals(Object rval) {
        return rval instanceof Dog2 &&super.equals(rval);
    }
}

class Pig2 extends Animal {
    Pig2(String name, Size size) {
        super(name, size);
    }

    @Override
    public boolean equals(Object rval) {
        return rval instanceof Pig2 &&
                super.equals(rval);
    }
}