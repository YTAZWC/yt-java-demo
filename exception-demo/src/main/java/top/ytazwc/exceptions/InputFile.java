package top.ytazwc.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 花木凋零成兰
 * @title InputFile
 * @date 2024/5/20 13:43
 * @package top.ytazwc.exceptions
 * @description 测试finally中资源关闭
 * 虽然finally每次都会执行清理代码,但是如果在代码执行中发生异常,也许某些资源对象还没被成功创建,
 * 而这些对象却要在finally中被清理;此时将会发生问题
 */
public class InputFile {

    private BufferedReader in;

    public InputFile(String fName) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fName));
            // 此时会有其他代码可能会抛出异常
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fName);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        } finally {
            // 不能关闭资源 in
            // finally 不能执行 因为资源应该在类实例的整个生命周期都存在
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }

}
