package cn.zr.cn.zr.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        HashMap map =new HashMap();
        map.put("name","小白");
        map.put("id","S001");
        map.put("age",17);
        map.put("salary",1000);
        HashMap map1 = new HashMap();
        map.put("name","小白");
        map.put("id","S002");
        map.put("age",18);
        map.put("salary",2000);
        List<HashMap> list =new ArrayList<>();
        list.add(map);
        list.add(map1);
        Iterator iterator = list.iterator();
    }
}
