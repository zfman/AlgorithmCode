package pattern.command;

/**
 * 命令模式
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Client {
    public static void main(String[] args){
        Stock stock=new Stock();
        BuyStock buyStock=new BuyStock(stock);
        SellStock sellStock=new SellStock(stock);

        Invoker invoker=new Invoker();
        invoker.takeOrder(buyStock);
        invoker.takeOrder(sellStock);
        invoker.placeOrders();
    }
}
