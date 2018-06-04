package cn.zr.cn.zr.fanxing;

public class Bjxst<T> {
    T t;

    public static void main(String[] args) {
//        泛型的 嵌套
        Bjxst<Student<String>> studentBjxst = new Bjxst<>();
        //使用时从外到内拆分
        studentBjxst.t = new Student<>(1,"晓明",20);
        Student<String> stu = studentBjxst.t;
        String name =stu.getName();
        System.out.println(name);

    }
}
