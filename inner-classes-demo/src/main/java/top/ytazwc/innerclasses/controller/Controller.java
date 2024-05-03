package top.ytazwc.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 花木凋零成兰
 * @title Controller
 * @date 2024/5/3 10:18
 * @package top.ytazwc.innerclasses.controller
 * @description 管理并触发事件的实际控制框架
 */
public class Controller {

    private List<Event> eventList = new ArrayList<>();

    // 增加事件
    public void addEvent(Event c) { eventList.add(c); }

    // 循环遍历 eventList，寻找就绪的（ready()）、要运行的 Event 对象
    public void run() {
        while(!eventList.isEmpty()) {
            // Make a copy so you're not modifying the list
            // while you're selecting the elements in it:
            for(Event e : new ArrayList<>(eventList)) {
                // 对找到的每一个就绪的（ready()）事件，使用对象的 toString() 打印其信息
                // 调用其 action() 方法，然后从列表中移除此 Event
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }

}
