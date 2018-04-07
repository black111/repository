package cn.com;

import java.util.Scanner;

public class ProblemK {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []W=new int[]{7,9,10,5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
		String modstr="10X98765432";
		while(true){
			String s=sc.nextLine();
			if(s.equals("-1")) break;
			int []A=new int[17];
			for(int i=0;i<s.length()-1;i++){
				A[i]=Integer.valueOf(s.substring(i,i+1));
			}
			
			int sum=0;
			for(int i=0;i<A.length;i++){
				sum+=A[i]*W[i];
			}
			int y=sum%11;
			if(modstr.substring(y,y+1).equals(s.substring(17))) System.out.println(1);
			else System.out.println(0);
		}
	}
}
