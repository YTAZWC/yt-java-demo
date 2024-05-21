package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title ExceptionSilencer
 * @date 2024/5/20 10:58
 * @package top.ytazwc.exceptions
 * @description 一种简单的异常丢失
 */
public class ExceptionSilencer {

    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } finally {
            return ;
        }

    }

}
