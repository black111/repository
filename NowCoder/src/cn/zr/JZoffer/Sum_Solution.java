package cn.zr.JZoffer;

public class Sum_Solution {

    public static void main(String[] args) {
        Sum_Solution s= new Sum_Solution();

//        System.out.println(s.Sum_Solution(10));
        System.out.println(s.Fibonacci(10));
    }
    public int Sum_Solution(int n) {
        int result = 0;

        result=n+Sum_Solution(--n);

        return result;
    }

    public int Fibonacci(int n) {
        int count=2;
        int a =1;
        int b =1;
        int c =0;
        if(n>2){
            while (count !=n){
                c=b;
                b=a;
                a=b+c;
                count++;
            }
        }else if (n==1||n==2){
             return 1;
        }else{
            return 0;
        }
        return a;
//        int []num = new int[100];
//        num[1]=1;
//        num[2]=1;
//        for (int i =2;i<100;i++){
//            num[i]=num[i-2]+num[i-1];
//        }
//        return num[n];
    }
}
