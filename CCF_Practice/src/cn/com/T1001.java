package cn.com;

import java.util.Scanner;

public class T1001 {

	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int [][]a=new int [n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=m-1;i>=0;i--){
			for(int j=0;j<n;j++){
				if(j!=n-1)
					System.out.print(a[j][i]+" ");
				else
					System.out.print(a[j][i]);
			}
			if(i!=0)
				System.out.println();
			
		}
	}
}
