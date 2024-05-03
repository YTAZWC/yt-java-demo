package top.ytazwc.innerclasses.controller;

/**
 * @author 花木凋零成兰
 * @title GreenhouseControls
 * @date 2024/5/3 10:26
 * @package top.ytazwc.innerclasses.controller
 * @description 典型的应用程序框架
 */
public class GreenhouseControls extends Controller {

    // 灯的状态
    private boolean light = false;

    // 温室开灯
    public class LightOn extends  Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    // 温室关灯
    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    // 水
    private boolean water = false;

    // 开水
    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    // 关水
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    // 温控器
    private String thermostat = "Day";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // Put hardware control code here.
            thermostat = "Night";
        }
        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // Put hardware control code here.
            thermostat = "Day";
        }
        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime.toMillis()));
        }
        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList) {
                addEvent(e);
            }
        }
        @Override
        public void action() {
            for(Event e : eventList) {
                e.start(); // Rerun each event
                addEvent(e);
            }
            start(); // Rerun this Event
            addEvent(this);
        }
        @Override
        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() { System.exit(0); }
        @Override
        public String toString() {
            return "Terminating";
        }
    }

}
