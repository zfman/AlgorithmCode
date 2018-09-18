package pattern.chain;

/**
 * 职责链模式
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Client {
    public static void main(String[] args){
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.LOG_ERROR);
        AbstractLogger debugLogger=new FileLogger(AbstractLogger.LOG_DEBUG);
        AbstractLogger infoLogger=new ConsoleLogger(AbstractLogger.LOG_INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        errorLogger.logMessage(AbstractLogger.LOG_INFO,"hello info");
        errorLogger.logMessage(AbstractLogger.LOG_DEBUG,"hello debug");
        errorLogger.logMessage(AbstractLogger.LOG_ERROR,"hello error");
    }
}
