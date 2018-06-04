package cn.zr.map;

import java.util.*;

/**
 * 定义一个学生student类，属性：name，姓名；classNo，班号；score，成绩
 * 现在将若干个学生对象放入list中，请统计出每个班级的总和，平均分，分别打印出来。
 */
public class MapDemo02 {

    public static   void main(String[] args) {
        List<Student> list =new ArrayList<>();
        exam(list);

        //统计
        Map<String,ClassRoom> map = new HashMap<String,ClassRoom>();
        count(map,list);
//        printscore(map);

    }
    //统计分数
    public static void count (Map<String,ClassRoom> rooms,List<Student> list){
        for(Student stu:list){
            String no = stu.getClassNo();
            double score = stu.getScore();
            //根据班级编号查看map中是否存在该班级
            ClassRoom room = rooms.get(no);
            if(null == room){
                room = new ClassRoom();
                rooms.put(no,room);
            }
            //存储
            room.setNo(no);
            room.setTotal(score+room.getTotal());
            room.getStus().add(stu);//加入学生对象
        }
        //打印总分数平均分
        Set<Map.Entry<String,ClassRoom>> entry = rooms.entrySet();
        Iterator<Map.Entry<String,ClassRoom>> it = entry.iterator();
        while(it.hasNext()){
            Map.Entry<String,ClassRoom> map1 = it.next();
            ClassRoom c = map1.getValue();
            double avg = c.getTotal()/c.getStus().size();
            System.out.println("班号为："+c.getNo()+",总分："+c.getTotal()+"，平均分："+avg);
        }

    }


    public static void printscore(Map<String,ClassRoom> map){
        Set<Map.Entry<String,ClassRoom>> entryset = map.entrySet();
        Iterator<Map.Entry<String,ClassRoom>> it = entryset.iterator();
        while (it.hasNext()){


        }

    }
    public static void exam(List<Student> list){
        list.add(new Student("晓明","001",99));
        list.add(new Student("小菜","001",88));
        list.add(new Student("李四","002",90));
        list.add(new Student("小明","002",80));
        list.add(new Student("笨笨","002",79));
        list.add(new Student("小李","003",70));
        list.add(new Student("小朱","003",85));
        list.add(new Student("小小","003",95));
    }
}

