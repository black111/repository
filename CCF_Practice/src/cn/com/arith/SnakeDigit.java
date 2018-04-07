package cn.com.arith;

import java.util.Scanner;

public class SnakeDigit {
		public static void main(String[] args) {
			final int MAX=10;
			int x,y;
			int count=1;
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int snake[][]=new int[MAX][MAX];//先将数组初始化为0
			snake[x=0][y=n-1]=1;//从右边第一个开始
			while(count<n*n){
				while(x+1<n&&snake[x+1][y]==0){//循环条件，判断是否到达边缘
					snake[++x][y]=++count;
				}
				while(y>0&&snake[x][y-1]==0){
					snake[x][--y]=++count;
				}
				while(x>0&&snake[x-1][y]==0){
					snake[--x][y]=++count;
				}
				while(y<n&&snake[x][y+1]==0 ){
					snake[x][++y]=++count;
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(snake[i][j]+"       ");
				}
				System.out.println();
			}
			
		}
 
}
