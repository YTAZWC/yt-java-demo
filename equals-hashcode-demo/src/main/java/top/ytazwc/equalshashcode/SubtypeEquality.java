package top.ytazwc.equalshashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author 花木凋零成兰
 * @title SubtypeEquality
 * @date 2024/5/4 22:13
 * @package top.ytazwc.equalshashcode
 * @description 不同子类的相等性
 */
public class SubtypeEquality {
    public static void main(String[] args) {
        Set<Animal> pets = new HashSet<>();
        pets.add(new Dog("Ralph", Size.MEDIUM));
        pets.add(new Pig("Ralph", Size.MEDIUM));
        pets.forEach(System.out::println);
    }
}

enum Size {
    SMALL, MEDIUM, LARGE
}

class Animal {
    private static int counter = 0;
    private final int id = counter++;
    private final String name;
    private final Size size;
    Animal(String name, Size size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public boolean equals(Object rval) {
        return rval instanceof Animal &&
                // Objects.equals(id, ((Animal)rval).id) && // [1]
                Objects.equals(name, ((Animal)rval).name) &&
                Objects.equals(size, ((Animal)rval).size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
        // return Objects.hash(name, size, id); // [2]
    }

    @Override
    public String toString() {
        return String.format("%s[%d]: %s %s %x",
                getClass().getSimpleName(), id,
                name, size, hashCode());
    }
}

class Dog extends Animal {
    Dog(String name, Size size) {
        super(name, size);
    }
}

class Pig extends Animal {
    Pig(String name, Size size) {
        super(name, size);
    }
}
