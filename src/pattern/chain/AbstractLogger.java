package pattern.chain;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public abstract class AbstractLogger {
    public static final int LOG_ERROR=1;
    public static final int LOG_DEBUG=2;
    public static final int LOG_INFO=3;
    protected int level;
    protected AbstractLogger nextLogger;

    public abstract void write(String msg);

    public void logMessage(int level,String msg){
        if(this.level<=level){
            write(msg);
        }
        if(nextLogger!=null){
            nextLogger.logMessage(level,msg);
        }
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
