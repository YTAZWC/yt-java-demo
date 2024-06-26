package top.ytazwc.equalshashcode.pets;

import java.util.Objects;

/**
 * @author 花木凋零成兰
 * @title Individual
 * @date 2024/5/5 8:36
 * @package top.ytazwc.equalshashcode
 * @description TODO
 */
public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name) { this.name = name; }
    // 'name' is optional:
    public Individual() {}
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                (name == null ? "" : " " + name);
    }
    public long id() { return id; }
    @Override
    public boolean equals(Object o) {
        return o instanceof Individual &&
                Objects.equals(id, ((Individual)o).id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
    @Override
    public int compareTo(Individual arg) {
        // Compare by class name first:
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if(firstCompare != 0)
        {
            return firstCompare;
        }
        if(name != null && arg.name != null) {
            int secondCompare = name.compareTo(arg.name);
            if(secondCompare != 0)
            {
                return secondCompare;
            }
        }
        return Long.compare(arg.id, id);
    }
}
