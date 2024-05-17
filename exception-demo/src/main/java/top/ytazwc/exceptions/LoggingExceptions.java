package top.ytazwc.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author 花木凋零成兰
 * @title LoggingExceptions
 * @date 2024/5/15 21:55
 * @package top.ytazwc.exceptions
 * @description 使用 java.util.logging 工具将输出记录到日志中
 */
public class LoggingExceptions {

    public static void main(String[] args) {

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }

    }

}

class LoggingException extends Exception {
    private static final Logger logger = Logger.getLogger("LoggingException");

    LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}
