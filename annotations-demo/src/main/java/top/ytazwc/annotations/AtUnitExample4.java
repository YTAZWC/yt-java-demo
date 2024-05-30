package top.ytazwc.annotations;

import top.ytazwc.annotations.onjava.atunit.Test;

import java.util.*;

/**
 * @author 花木凋零成兰
 * @title AtUnitExample4
 * @date 2024/5/30 10:28
 * @package top.ytazwc.annotations
 * @description 有的时候，你需要向单元测试中增加一些字段
 * 这时候可以使用 @TestProperty 注解，由它注解的字段表示只在单元测试中使用
 * 因此，在你将产品发布给客户之前，他们应该被删除
 */
public class AtUnitExample4 {
    static String theory = "All brontosauruses " +
            "are thin at one end, much MUCH thicker in the " +
            "middle, and then thin again at the far end.";
    private String word;
    // Time-based seed
    private Random rand = new Random();

    public AtUnitExample4(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    /**
     * 打乱word字符串中字符顺序
     * @return 打乱结果
     */
    public String scrambleWord() {
        List<Character> chars = new ArrayList<>();
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            chars.add(c);
        }
        Collections.shuffle(chars, rand);
        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            result.append(ch);
        }
        return result.toString();
    }

    static List<String> input = Arrays.asList(theory.split(" "));
//    @TestProperty
    static Iterator<String> words = input.iterator();
//    @TestObjectCreate
    static AtUnitExample4 create() {
        if(words.hasNext()) {
            return new AtUnitExample4(words.next());
        }
        else {
            return null;
        }
    }

    @Test
    boolean words() {
        System.out.println("'" + getWord() + "'");
        return "are".equals(getWord());
    }
    @Test
    boolean scramble1() {
        // 使用特定的种子来获得可验证的结果：
        rand = new Random(47);
        System.out.println("'" + getWord() + "'");
        String scrambled = scrambleWord();
        System.out.println(scrambled);
        return "lAl".equals(scrambled);
    }
    @Test
    boolean scramble2() {
        rand = new Random(74);
        System.out.println("'" + getWord() + "'");
        String scrambled = scrambleWord();
        System.out.println(scrambled);
        return "tsaeborornussu".equals(scrambled);
    }

}
