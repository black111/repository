package cn.com.arith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PAT_1005 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		List<Integer> arrayOne=new ArrayList<Integer>();
		for(int array:a){
			while(array!=1){
				if(array%2==0){
					array=array/2;
				}else{
					array=(array*3+1)/2;
				}
				arrayOne.add(array);
			}
		}
		List<Integer>arrayTwo=new ArrayList<Integer>();
		for(int array:a){
			if(!arrayOne.contains(array)){
				arrayTwo.add(array);
			}
		}
		int[]arr1=new int[arrayTwo.size()];
		for(int i=0;i<arrayTwo.size();i++){
			arr1[i]=arrayTwo.get(i).intValue();
		}
		for(int arr:arr1){
			Arrays.sort(arr1);
		}
		for(int i=arr1.length-1;i>0;i--){
			System.out.print(arr1[i]+" ");
		}
		System.out.println(arr1[0]);
	}


}
