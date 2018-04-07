package cn.com.arith;

	import java.util.Scanner;
	public class PAT_1006 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();			
			int gewei=n%10;
			n/=10;
			int shiwei=n%10;
			n/=10;
			int baiwei=n;
			for(int i=0;i<baiwei;i++){
				System.out.print("B");
			}
			for(int i=0;i<shiwei;i++){
				System.out.print("S");
			}
			for(int i=0;i<gewei;i++){
				System.out.print(i+1);
			}
		}
	}
