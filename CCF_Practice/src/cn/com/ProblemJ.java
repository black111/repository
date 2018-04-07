package cn.com;

import java.util.Scanner;

public class ProblemJ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			String str1=sc.nextLine();
			if(str1.equals("ENDOFINPUT")) break;
			String pwd=sc.nextLine();
			String str2=sc.nextLine();	
			
			char[]s=pwd.toCharArray();
			for(int i=0;i<pwd.length();i++){
				if(s[i]>=70&&s[i]<=90){
					s[i]=(char)(s[i]-5);
				}else if(s[i]>=65){
					s[i]=(char)(s[i]+21);
				}
			}
			System.out.println(s);
		}
	}
}
