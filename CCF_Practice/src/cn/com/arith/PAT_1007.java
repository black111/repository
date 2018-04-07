package cn.com.arith;

import java.util.Scanner;

public class PAT_1007 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Primepairs=sc.nextInt();
		int []a=new int[Primepairs];
		int count0=0;
		for(int i=2;i<=Primepairs;i++){
			int j=0;
			for( j=2;j<=Math.sqrt(i);j++){
				if(i%j==0) break;
			}
			if(j>Math.sqrt(i)) a[count0++]=i;
		}
		int count1=0;
		for(int i=count0;i>0;i--){
			if(a[i]-a[i-1]==2) count1++;
		}
		System.out.println(count1);
	}
	
}
