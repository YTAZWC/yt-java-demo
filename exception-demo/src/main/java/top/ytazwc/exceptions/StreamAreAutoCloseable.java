package top.ytazwc.exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author 花木凋零成兰
 * @title StreamAreAutoCloseable
 * @date 2024/5/20 21:56
 * @package top.ytazwc.exceptions
 * @description TODO
 */
public class StreamAreAutoCloseable {

    public static void main(String[] args) throws IOException {
        try (
                Stream<String> in = Files.lines(Paths.get("StreamsAreAutoCloseable.java"));
                PrintWriter outfile = new PrintWriter("Results.txt");
        ) {

            in.skip(5).limit(1).map(String::toLowerCase).forEachOrdered(outfile::println);
        }
    }

}
