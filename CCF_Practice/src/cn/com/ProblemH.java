package cn.com;

import java.util.Scanner;

public class ProblemH {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(true){
			int a=sc.nextInt()%23;
			int b=sc.nextInt()%28;
			int c=sc.nextInt()%33;
			int d=sc.nextInt();
			if(a==-1&&b==-1&&c==-1&&d==-1) break;
			int days=d+1;
			while((days-a)%23!=0||(days-b)%28!=0||(days-c)%33!=0){
				days++;
			}
			int j=days-d;
			System.out.println("Case "+count+": the next triple peak occurs in "+j+" days.");
			count++;
		}
	}
}
