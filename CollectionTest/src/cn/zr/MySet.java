package cn.zr;


import java.util.HashMap;

/**
 * @author lively
 * 自己定义hashSet,不能有重复元素
 */

public class MySet {

    HashMap map;
    int size;

    private static final Object PRESENT = new Object();

    public int size(){
        return map.size();
    }
    public MySet(){
        map = new HashMap();
    }
    public void add(Object obj){
        map.put(obj,PRESENT);//Set的不可重复就是利用了hashMap里面的键不可重复
        size++;
    }
    public void remove(Object obj){

    }
    public static void main(String[] args) {
//        Set s = new HashSet();
//        s.add("1");
//        s.add("2");
//        s.add("1");
//        Iterator it = s.iterator();
//        System.out.println(s.size());
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        MySet mySet = new MySet();
        mySet.add("name");
        mySet.add("name");
        mySet.add(new String("name"));
        mySet.add(new String("name"));
        System.out.println(mySet.size());

    }
}
