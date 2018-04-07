package cn.com;

import java.util.Scanner;

public class Test2016_4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0;
		int Day=s.nextInt();
		while(Day>1000||Day<0){
				Day=s.nextInt();
		}
		int a[]=new int[Day];
		for(int i=0;i<Day;i++){
			if(a[i]>=0&&a[i]<=10000){
				a[i]=s.nextInt();
			}
		}
		for(int i=1;i<Day-1;i++){
			if(a[i]>a[i-1]&&a[i]>a[i+1]||a[i]<a[i-1]&&a[i]<a[i+1]){
				count++;
			}
		}
		System.out.println(count);
	}

}
