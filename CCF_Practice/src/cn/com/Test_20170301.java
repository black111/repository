package cn.com;

import java.util.Scanner;

public class Test_20170301 {
	public static void main(String[] args) {
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int []a=new int[n+1];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();	
		}
		
		int count =0;
		int sum=0;
		int cake_count=1;
		while(count<=n){
			sum+=a[count++];			
			if(sum>=k&&count<n){
				cake_count++;
				sum=0;	
			}
			
		}
		System.out.println(cake_count);
	}
}
