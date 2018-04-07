package cn.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProblemN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char []s=str.toCharArray();
		char tmp=' ';
		for(int i=s.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(s[i]>='A'&&s[i]<='Z'&&s[j]>='A'&&s[j]<='Z'){
					if(s[i]<s[j]){
						tmp=s[i];
						s[i]=s[j];
						s[j]=tmp;
					}
				}
			}
		}
		System.out.println(s);
		
		
	}
	
	
}
