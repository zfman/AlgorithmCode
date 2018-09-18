package pattern.iterator;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index<names.length) return true;
            return false;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}
