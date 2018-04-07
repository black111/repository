package cn.com;

import java.util.Scanner;
public class Test2016_4_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[16][11];
		int a_sqrt[][]=new int[5][5];
		int x[]=new int[6];
		int y[]=new int[6];
		for(int i=1;i<=15;i++){
			for(int j=1;j<=10;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				a_sqrt[i][j]=sc.nextInt();
			}
		}
		int column=sc.nextInt();//结点位置
		int k=0;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				if(a_sqrt[i][j]==1){
					x[k]=i;
					y[k++]=j+column-1;
				}
			}
		}
		//记录为1的方块的位置
		boolean flag=true;
		int row1=0;//记录第row1行
		int row2=0;//记录
		while(flag){
			for(int i=1;i<5;i++){
				
			}
		}
		
		
		
		
		
		print(a,16,11);
		
	}
	public static void print(int a[][],int m,int n){
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
//输入
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 1 0 0
//0 0 0 0 0 0 1 0 0 0
//0 0 0 0 0 0 1 0 0 0
//1 1 1 0 0 0 1 1 1 1
//0 0 0 0 1 0 0 0 0 0
//0 0 0 0
//0 1 1 1
//0 0 0 1
//0 0 0 0
//3
//输出
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 1 0 0
//0 0 0 0 0 0 1 0 0 0
//0 0 0 0 0 0 1 0 0 0
//1 1 1 1 1 1 1 1 1 1
//0 0 0 0 1 1 0 0 0 0