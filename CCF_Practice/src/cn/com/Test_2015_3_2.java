package cn.com;
import java.util.Scanner;
public class Test_2015_3_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int x;
		int a[]=new int[1005];
		for(int i=0;i<n;i++){
			x=sc.nextInt();
			a[x]++;
		}
		for(int i=1004;i>0;i--){
			for(int j=0;j<1005;j++){
				if(a[j]==i){
					System.out.println(j+" "+a[j]);
				}
			}
		}
		
	}
}
//题目：给定n个整数，请统计出每个整数出现的次数，按出现次数从多到少的顺序输出
//1 ≤ n ≤ 1000，给出的数都是不超过1000的非负整数
//样例： 12
// 5 2 3 3 1 3 4 2 5 2 3 5
//输出： 3 4
//    2 3
//    5 3
//    1 1
//    4 1

