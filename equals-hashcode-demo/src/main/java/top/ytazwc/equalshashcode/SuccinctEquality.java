package top.ytazwc.equalshashcode;

import java.util.Objects;

/**
 * @author 花木凋零成兰
 * @title SuccinctEquality
 * @date 2024/5/4 21:49
 * @package top.ytazwc.equalshashcode
 * @description 更精简的 equals() 函数
 */
public class SuccinctEquality extends Equality {
    public SuccinctEquality(int i, String s, double d) {
        super(i, s, d);
        System.out.println("made 'SuccinctEquality'");
    }

    @Override
    public boolean equals(Object rval) {
        return rval instanceof SuccinctEquality
                && Objects.equals(i, ((SuccinctEquality)rval).i)
                && Objects.equals(s, ((SuccinctEquality)rval).s)
                && Objects.equals(d, ((SuccinctEquality)rval).d);
    }
    public static void main(String[] args) {
        Equality.testAll( (i, s, d) ->
                new SuccinctEquality(i, s, d));
    }

}
