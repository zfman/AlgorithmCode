package pattern.iterator;

/**
 * 迭代器模式
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Client {
    public static void main(String[] args){
        NameRepository repository=new NameRepository();
        Iterator iterator=repository.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
