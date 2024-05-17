package top.ytazwc.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author 花木凋零成兰
 * @title LoggingExceptions2
 * @date 2024/5/15 22:19
 * @package top.ytazwc.exceptions
 * @description 在异常处理程序中生成日志消息
 */
public class LoggingExceptions2 {

    private final static Logger logger = Logger.getLogger("LoggingException2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }

}
