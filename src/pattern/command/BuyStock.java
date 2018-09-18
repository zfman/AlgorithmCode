package pattern.command;

/**
 * buyStock 命令
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class BuyStock implements Order {
    Stock stock;
    public BuyStock(Stock stock){
        this.stock=stock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}
