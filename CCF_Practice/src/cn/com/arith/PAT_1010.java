package cn.com.arith;

import java.util.Scanner;
public class PAT_1010 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isHaveoutput=false;
		while(sc.hasNext()){
			int expon=sc.nextInt();
			int coef=sc.nextInt();
			if(expon*coef!=0){				
				if(isHaveoutput){
					System.out.print(" ");
				}else{
					isHaveoutput=true;
				}
				System.out.print(expon*coef+" "+(coef-1));
			}	
			if(!isHaveoutput){
				System.out.println("0 0");
			}
		}		
		sc.close();
		
		
	}
}
