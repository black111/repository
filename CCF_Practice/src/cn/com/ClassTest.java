package cn.com;

public class ClassTest{
	static int s;
	public static int print(){
		return 1;
	}
    String str = new String("hello");
    char[] ch = {'a','b','c'};
    public void fun(String str, char ch[]){
    str="world";
    ch[0]='d';
}
public static void main(String[] args) {
	ClassTest.print();
    ClassTest test1 = new ClassTest();
    test1.fun(test1.str,test1.ch);
    System.out.print(test1.str + " and ");
    System.out.print(test1.ch);
    
    }
}