package top.ytazwc.exceptions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

/**
 * @author 花木凋零成兰
 * @title TryWithResources
 * @date 2024/5/20 21:15
 * @package top.ytazwc.exceptions
 * @description Java 7 引入了 try-with-resources 语法
 */
public class TryWithResources {
    public static void main(String[] args) {
        try (
                InputStream in = Files.newInputStream(new File("TryWithResources.java").toPath())
                ) {
            int contents = in.read();
        } catch (IOException e) {

        }
    }
}
