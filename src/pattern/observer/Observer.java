package pattern.observer;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
