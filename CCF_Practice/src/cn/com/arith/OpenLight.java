package cn.com.arith;

import java.util.Scanner;

public class OpenLight {

	public static void main(String[] args) {
		int n;//n’µµ∆
		int k;//k∏ˆ»À
		int MAX=1000+10;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int[]a=new int[MAX];
		for(int i=1;i<=k;i++){
			for(int j=1;j<=n;j++){
				if(j%i==0&&a[j]==0){
					a[j]=1;					
				}else if(j%i==0&&a[j]==1){
					a[j]=0;
				}
				
			}
		}
		for(int i=1;i<=n;i++){
			if(a[i]==1){
				System.out.print(i+"  ");
			}
		}
	}

}
