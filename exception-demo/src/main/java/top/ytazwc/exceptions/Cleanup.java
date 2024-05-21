package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title Cleanup
 * @date 2024/5/20 17:35
 * @package top.ytazwc.exceptions
 * @description TODO
 */
public class Cleanup {

    public static void main(String[] args) {

        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ( (s = in.getLine()) != null) {

                }
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }

    }

}
