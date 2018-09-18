package pattern.chain;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level=level;
    }
    @Override
    public void write(String msg) {
        System.out.println("ErrorLogger::"+msg);
    }
}
