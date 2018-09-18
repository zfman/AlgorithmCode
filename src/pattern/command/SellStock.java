package pattern.command;

/**
 * sellStock命令
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class SellStock implements Order{
    Stock stock;
    public SellStock(Stock stock){
        this.stock=stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
