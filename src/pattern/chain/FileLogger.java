package pattern.chain;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level=level;
    }
    @Override
    public void write(String msg) {
        System.out.println("FileLogger::"+msg);
    }
}
