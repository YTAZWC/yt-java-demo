package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title StormyInning
 * @date 2024/5/20 11:02
 * @package top.ytazwc.exceptions
 * @description 异常限制
 * 当覆盖方法时,只能抛出在基类方法的异常说明里的列表异常或其子类
 */
public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {}

    public StormyInning(String s) throws BaseballException {}

    @Override
    public void atBat() throws PopFoul {
    }

    @Override
    public void rainHard() throws RainedOut {
    }

    @Override
    public void event() {
    }

    public static void main(String[] args) {

        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

    }

}

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    Inning() throws BaseballException {}
    public void event() throws BaseballException {
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}