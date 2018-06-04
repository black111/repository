package cn.zr.cn.zr.collection;

import java.util.Iterator;

/**
 * 加入接口，提供方法
 */
public class MyIterator2 {
    String[] elem = {"a","b","c","d","e","f","g"};
    int size = elem.length;//简化迭代器原理
    private int cursor=-1;

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                {
                    return (cursor +1!=size);
                }
            }

            @Override
            public String next() {
                cursor++;
                return elem[cursor];
            }
            public void remore(String e){

            }
        };
    }
    public static void main(String[] args) {
        MyIterator2 m = new MyIterator2();
        Iterator iterator = m.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
