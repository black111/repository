package cn.zr;

import java.util.HashMap;
import java.util.Map;

/**
 *自定义实现map的功能
 * 存放键值对
 */
public class MyMap {
    myEntry[] arr = new myEntry[999];
    int size;
    public void put(Object key,Object value){
        myEntry entry = new myEntry(key,value);
        arr[size++] =  entry;
    }

    public Object get(Object key){
        for(int i =0;i<size;i++){
            if(arr[i].key == key){
                return arr[i].value;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Map m = new HashMap();
    }
}
class myEntry{
    Object key;
    Object value;

    public myEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
