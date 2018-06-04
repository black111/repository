package cn.zr;

import java.util.ArrayList;
import java.util.Date;

public class MyArrayList {
    private Object[] element;
    private int size;

    public MyArrayList(){
        this(10);
    }
    public MyArrayList(int capacity){
        if(capacity<0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        element = new Object[capacity];
    }
    public void add(Object e){
//        数组扩容
        if(size == element.length){
            Object[] newArr = new Object[size*2+1];
            System.arraycopy(element,0 ,newArr,0,element.length);
            element = newArr;
        }
        element[size++] = e;

    }
    public Object get(int index){
        changeIndex(index);
        return element[index];
    }
    public void remove(int index){
        if(index <0 || index >=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void changeIndex(int index){
        if(index<0||index>=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MyArrayList ml=new MyArrayList();
        ArrayList l = new ArrayList();
        ml.add("1");
        ml.add(new Date());
        System.out.println(ml.get(1));
    }
}
