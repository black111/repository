package cn.zr;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 自定义map的升级版
 * 提高查询的效率
 */
public class Mymap01 {
//    myEntry[] arr = new myEntry[999];
    LinkedList[] arr = new LinkedList[999];//map的底层机构  数组+链表
    int size;

    public void put(Object key,Object value)
    {
        myEntry m = new myEntry(key,value);
        int a = key.hashCode()%999;
        if (null == arr[a]){
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(m);
        }else{
            //需要做判断，避免key重复
            LinkedList list= arr[a];
            for(int i =0;i<list.size();i++){
                myEntry e=(myEntry) list.get(i);
                if(e.key.equals(key)){
                    e.value = value;
                    return;
                }
            }
            arr[a].add(m);
        }

    }

    public Object get(Object key){
        int a = key.hashCode()%arr.length;
        if (null != arr[a]){
            LinkedList list = arr[a];
            for(int i =0;i<list.size();i++){
                myEntry e=(myEntry) list.get(i);
                if(e.key.equals(key)){
                    return e.value;
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        Mymap01 map = new Mymap01();
        map.put("我","白");
        map.put("你","黑");
        System.out.println(map.get("我"));
        map.put("name",2);
        HashMap map1 = new HashMap();

    }
}
