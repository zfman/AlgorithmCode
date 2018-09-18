package pattern.memento;

/**
 * 备忘录模式
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Client {
    public static void main(String[] args){
        Originator originator=new Originator();
        originator.setState("State 1");
        System.out.println(originator.getState());

        CareTaker taker=new CareTaker();
        taker.add(originator.saveState());

        originator.setState("State 2");
        taker.add(originator.saveState());
        System.out.println(originator.getState());

        originator.restoreFromState(taker.get(0));
        System.out.println(originator.getState());
    }
}
