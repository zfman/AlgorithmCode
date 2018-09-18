package pattern.command;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Stock {
    public String name="aa";
    public float quantity=4.0f;

    public void buy(){
        System.out.println("buy::"+name+","+quantity);
    }

    public void sell(){
        System.out.println("sell::"+name+","+quantity);
    }
}
