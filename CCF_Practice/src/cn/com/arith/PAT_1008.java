package cn.com.arith;

import java.util.Scanner;

public class PAT_1008 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		long start=System.currentTimeMillis();
		
		if(num!=a.length){move(a,num);}
		System.out.println(System.currentTimeMillis()-start);
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print(a[a.length-1]);
	}
	public static void move(int []a,int num){
		int temp;
		for(int j=0;j<num;j++){
			temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--){				
				a[i]=a[i-1];				
			}
			a[0]=temp;
		}
		
	}
}
