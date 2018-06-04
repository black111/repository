package cn.zr.cn.zr.collection;

public class MyIterator<E> {
    String[] elem = {"a","b","c","d","e","f","g"};
    int size = elem.length;//简化迭代器原理
    private int cursor=-1;

    /**
     * 判断是否存在下一个元素
     * @return
     */
    public boolean hasNext(){
        return (cursor +1!=size);
    }

    /**
     * 获取下一个元素
     * @return
     */
    public E next(){
        cursor++;
        return (E) elem[cursor];
    }
    public void remore(E e){

    }

    public static void main(String[] args) {
        MyIterator m = new MyIterator();
        while (m.hasNext()){
            System.out.println(m.next());
        }
    }
}

