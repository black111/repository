package cn.com.arith;

import java.util.Scanner;

public class Hanxin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int i;
		for(i=10;i<=100;i++){
			if((i%3==a)&&(i%5==b)&&(i%7==c)){
				System.out.println(i);
				break;
			}
		}
		if(i>100){
			System.out.println("No answer");
		}
		double f=12.1f;
		System.out.println(String.format("%.3f", f));
	}

}
