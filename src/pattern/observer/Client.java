package pattern.observer;

/**
 * 观察者模式
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Client {
    public static void main(String[] args){
        Subject subject=new Subject();
        new Observer1(subject);
        new Observer2(subject);

        subject.setState("New State");
    }
}
