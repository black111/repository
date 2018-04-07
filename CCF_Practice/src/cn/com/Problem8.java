package cn.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			List<Integer> list=new ArrayList<Integer>();
			for(int i=1;i<=n;i++){
				list.add(i);
			}			
			for(int i=0;i<list.size();i++){
				if(list.size()!=1){
					if((i+1)%m==0) list.remove(i);
				}else{
					System.out.println(list.get(0));
				}
			}
		}
		
	}
	public static void move(int []a,int m){
		for(int i=a.length-1;i>=m+1;i--){
			a[i-1]=a[i];
		}
		
	}
}
