package pattern.memento;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Originator {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public void restoreFromState(Memento memento){
        this.state=memento.getState();
    }
}
