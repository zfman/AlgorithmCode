package pattern.mediator;

/**
 * 中介者模式
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Client {
    public static void main(String[] args){
        User user1=new User("刘壮飞");
        User user2=new User("刘大飞");
        user1.sendMessage("hello world");
        user2.sendMessage("hello see you !");
    }
}
