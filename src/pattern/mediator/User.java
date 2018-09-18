package pattern.mediator;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class User {
    private String name;

    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg){
        ChatRoom.show(getName(),msg);
    }
}
