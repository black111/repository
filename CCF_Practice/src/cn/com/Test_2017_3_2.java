package cn.com;

import java.util.Scanner;

public class Test_2017_3_2 {
	public static void move(int a[],int index,int q){
		if(q>0){
			int num=a[index];
			for(int i=index;i<index+q;i++){
				a[i]=a[i+1];
			}
			a[index+q]=num;
		}else{
			int num=a[index];
			for(int i=index;i>index+q;i--){
				a[i]=a[i-1];
			}
			a[index+q]=num;
		}
	}
	public static int findIndex(int a[],int p){
		int index=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==p){
				index=i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int stNo=sc.nextInt();
		int stMove=sc.nextInt();
		int [] a=new int[stNo];
		for(int i=0;i<stNo;i++){
			a[i]=i+1;
		}
		int p,q;
		for(int i=0;i<stMove;i++){
			p=sc.nextInt();
			int index=findIndex(a, p);
			q=sc.nextInt();
			move(a,index,q);
		}
		for(int w:a){
			System.out.print(w+" ");
		}
	}
}
