package top.ytazwc.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author 花木凋零成兰
 * @title InputFile2
 * @date 2024/5/20 18:00
 * @package top.ytazwc.exceptions
 * @description 更好的实现方式
 * 在构造函数读取文件,并在内部缓冲它; 这样文件的打开,读取,关闭都发生在构造函数中
 * 如果读取和存储文件不切实际,还可以改为Stream
 */
public class InputFile2 {

    private String fName;

    public InputFile2(String fName) {
        this.fName = fName;
    }

    public Stream<String> getLines() throws IOException {
        return Files.lines(Paths.get(fName));
    }

    public static void main(String[] args) throws IOException {
        new InputFile2("InputFile2.java").getLines()
                .skip(15)
                .limit(1)
                .forEach(System.out::println);
    }

}
