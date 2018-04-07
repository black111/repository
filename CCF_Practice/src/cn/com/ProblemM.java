package cn.com;

	import java.util.Scanner;
	public class ProblemM {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int []a=new int[10];			
			while(true){
				int flag=1;
				for(int i=0;i<10;i++){
					a[i]=sc.nextInt();
					if(a[i]==-1) {flag=0;break;}
				}
				if(flag==0)break;		
				if(isDataPiple(a)) System.out.println("YES");
				else System.out.println("NO");
						
			}
		}
	
		private static boolean isDataPiple(int[] a) {
			int data[][]=new int[][]
					{{1,1,0,0,0,0,0,1,1,0},
		            {1,1,0,1,1,0,0,1,1,1},
		            {0,0,1,0,0,0,0,0,1,0},
		            {0,1,0,1,0,0,0,1,1,1},
		            {0,1,0,0,1,0,0,0,1,1},
		            {0,0,0,0,0,1,1,0,1,1},
		            {0,0,0,0,0,1,1,0,1,0},
		            {1,1,0,1,0,0,0,1,1,1},
		            {1,1,1,1,1,1,1,1,1,1},
		            {0,1,0,1,1,1,0,1,1,1}};
	         int flag=0;
			for(int i=0;i<9;i++){
				if(data[a[i]][a[i+1]]==0){
					flag=1;
				}
				if(flag==1) break;
			}
			if(flag==1) return false; 
			else return true;
		}
	}
