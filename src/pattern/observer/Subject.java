package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Subject {
    List<Observer> observers=new ArrayList<>();
    String state;

    public void setState(String state) {
        this.state = state;
        onNotify();
    }

    public String getState() {
        return state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void onNotify(){
        for(Observer observer:observers){
            observer.update();
        }
    }
}
