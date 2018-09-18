package pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class CareTaker {
    List<Memento> mementos=new ArrayList<>();
    public void add(Memento memento){
        mementos.add(memento);
    }
    public Memento get(int i){
        return mementos.get(i);
    }
}
