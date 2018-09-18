package pattern.memento;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }
}
