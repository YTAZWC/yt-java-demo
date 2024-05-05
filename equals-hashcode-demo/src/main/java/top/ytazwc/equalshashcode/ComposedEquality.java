package top.ytazwc.equalshashcode;

import java.util.Objects;

/**
 * @author 花木凋零成兰
 * @title ComposedEquality
 * @date 2024/5/4 21:54
 * @package top.ytazwc.equalshashcode
 * @description TODO
 */
public class ComposedEquality extends SuccinctEquality {
    Part part;
    public ComposedEquality(int i, String s, double d) {
        super(i, s, d);
        part = new Part(s, d);
        System.out.println("made 'ComposedEquality'");
    }
    @Override
    public boolean equals(Object rval) {
        return rval instanceof ComposedEquality &&
                super.equals(rval) &&
                Objects.equals(part,
                        ((ComposedEquality)rval).part);

    }

    public static void main(String[] args) {
        Equality.testAll( (i, s, d) ->
                new ComposedEquality(i, s, d));
    }
}

class Part {
    String ss;
    double dd;

    Part(String ss, double dd) {
        this.ss = ss;
        this.dd = dd;
    }

    @Override
    public boolean equals(Object rval) {
        return rval instanceof Part &&
                Objects.equals(ss, ((Part)rval).ss) &&
                Objects.equals(dd, ((Part)rval).dd);
    }

}