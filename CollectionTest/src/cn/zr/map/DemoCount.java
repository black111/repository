package cn.zr.map;

import java.util.HashMap;
import java.util.Set;

public class DemoCount {
    public static void main(String[] args) {
        String str = "to be or not to be that is a question";
        //分割字符串
        String[] strArray = str.split(" ");
        //存入map中
        HashMap<String,Letter> letters = new HashMap<>();
//        for(String tmp:strArray){
//            //1、为所有的key创建容器 ，之后容器中存放对应的key
//            if(!letters.containsKey(tmp)){
//                letters.put(tmp,new Letter());
//            }
//            Letter col = letters.get(tmp);//直接使用容器
//            col.setCount(col.getCount()+1);
//        }
        for(String tmp:strArray){
            //1、为所有的key创建容器 ，之后容器中存放对应的key
//            if(!letters.containsKey(tmp)){
//                Letter col = new Letter();
//                col.setCount(1);//第一次把count设为1
//                letters.put(tmp,col);
//            }else{
//                Letter col = letters.get(tmp);
//                col.setCount(col.getCount()+1);
//            }
            Letter col = null;
            if(null==letters.get(tmp)){
                col = new Letter();
                col.setCount(1);//第一次把count设为1
                letters.put(tmp,col);
            }else{
                col = letters.get(tmp);
                col.setCount(col.getCount()+1);
            }

        }
//        for(String tmp:strArray){
//            //之后容器中存放对应的key
//
//
//        }
        Set<String> keys = letters.keySet();
        for(String key:keys){
            System.out.println("字母"+key+"出现的次数："+letters.get(key).getCount());
        }
    }
}
