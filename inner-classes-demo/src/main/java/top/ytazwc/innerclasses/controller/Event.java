package top.ytazwc.innerclasses.controller;

import java.time.Instant;

import java.time.*;

/**
 * @author 花木凋零成兰
 * @title Event
 * @date 2024/5/3 10:13
 * @package top.ytazwc.innerclasses.controller
 * @description 抽象类 描述了需要控制的事件
 * 默认的行为是基于时间去执行控制，所以使用抽象类代替实际的接口
 */
public abstract class Event {

    private Instant eventTime;

    protected final Duration delayTime;

    public Event(long millisecondDelay) {
        delayTime = Duration.ofMillis(millisecondDelay);
        start();
    }

    // 独立的方法，而没有包含在构造器内，因为这样就可以在事件运行以后重新启动计时器
    public void start() { // Allows restarting
        eventTime = Instant.now().plus(delayTime);
    }

    // 判断何时 可以运行 action() 方法
    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();

}
