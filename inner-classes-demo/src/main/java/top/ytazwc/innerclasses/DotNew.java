package top.ytazwc.innerclasses;

/**
 * @author 花木凋零成兰
 * @title DotNew
 * @date 2024/5/2 17:31
 * @package top.ytazwc.innerclasses
 * @description 使用.new
 * 有时你可能想要告知某些其他对象，去创建其某个内部类的对象
 * 要实现此目的，你必须在 new 表达式中提供对其他外部类对象的引用
 * 这是需要使用 .new 语法
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}

