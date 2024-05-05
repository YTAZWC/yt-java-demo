package top.ytazwc.equalshashcode;

/**
 * @author 花木凋零成兰
 * @title Groundhog
 * @date 2024/5/4 22:27
 * @package top.ytazwc.equalshashcode
 * @description Looks plausible, but doesn't work as a HashMap key
 */
public class Groundhog {
    protected int number;
    public Groundhog(int n) { number = n; }
    @Override
    public String toString() {
        return "Groundhog #" + number;
    }
}
