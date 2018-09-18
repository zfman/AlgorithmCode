package pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用者
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Invoker {
    public List<Order> orders=new ArrayList<>();

    public void takeOrder(Order o){
        orders.add(o);
    }

    public void placeOrders(){
        for(Order o:orders){
            o.execute();
        }
    }
}
