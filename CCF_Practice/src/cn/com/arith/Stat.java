package cn.com.arith;

import java.util.Scanner;
import java.util.Stack;

public class Stat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i;
		int[] a=new int[n];
		int m;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		m=sc.nextInt();
		int count=0;
		for(i=0;i<n;i++){
			if(a[i]<m){
				count++;
			}
		}
		System.out.println(count);
	}

}

