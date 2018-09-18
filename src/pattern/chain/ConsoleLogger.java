package pattern.chain;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level=level;
    }
    @Override
    public void write(String msg) {
        System.out.println("ConsoleLogger::"+msg);
    }
}
