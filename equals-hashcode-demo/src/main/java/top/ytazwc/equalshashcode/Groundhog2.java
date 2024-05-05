package top.ytazwc.equalshashcode;

import java.util.Objects;

/**
 * @author 花木凋零成兰
 * @title Groundhog2
 * @date 2024/5/4 22:42
 * @package top.ytazwc.equalshashcode
 * @description A class that's used as a key in a HashMap
 * must override hashCode() and equals()
 */
public class Groundhog2 extends Groundhog {
    public Groundhog2(int n) { super(n); }
    @Override
    public int hashCode() { return number; }
    @Override
    public boolean equals(Object o) {
        return o instanceof Groundhog2 &&
                Objects.equals(number, ((Groundhog2)o).number);
    }
}
