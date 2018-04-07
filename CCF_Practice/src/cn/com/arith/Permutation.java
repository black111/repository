package cn.com.arith;

public class Permutation {

	public static void main(String[] args) {
		int abc,def,ghi;
		int i=1;
		int[] a=new int[10];
		int count=0;
		for(abc=123;abc<=329;abc++){
			def=abc*2;
			ghi=abc*3;
			a[abc/100]=a[abc/10%10]=a[abc%10]=1;
			a[def/100]=a[def/10%10]=a[def%10]=1;
			a[ghi/100]=a[ghi/10%10]=a[ghi%10]=1;
			//
			for(i=1;i<=9;i++){
				count+=a[i];//用
			}
			if(count==9){
				System.out.println(abc+" "+def+" "+ghi);
			}
			count=0;
			for(i=0;i<=9;i++){
				a[i]=0;//数组清0
			}
		}		
		
	}

}
