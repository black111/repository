package cn.com.arith;

import java.util.Scanner;

public class PAT_1002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++){
			sum+=Integer.valueOf(s.substring(i,i+1));
		}
		int [] a=new int[9];
		int index=0;
		while(sum!=0){			
			a[index]=sum%10;
			index++;
			sum=sum/10;
		}		
		for(int i=index-1;i>=0;i--){
			if(i==0){
				System.out.print(convertDigitToAlp(a[i]));
			}else{
				System.out.print(convertDigitToAlp(a[i])+" ");
			}
		}
	}
	public static String convertDigitToAlp(int num){
		String alph=null;
		switch (num) {
		case 0:
			alph="ling";
			break;
		case 1:
			alph="yi";
			break;
		case 2:
			alph= "er";
			break;
		case 3:
			alph= "san";
			break;
		case 4:
			alph= "si";
			break;
		case 5:
			alph= "wu";
			break;
		case 6:
			alph= "liu";
			break;
		case 7:
			alph= "qi";
			break;
		case 8:
			alph= "ba";
			break;
		case 9:
			alph= "jiu";
			break;
		default:
			break;
		}
		return alph;
	}
}
