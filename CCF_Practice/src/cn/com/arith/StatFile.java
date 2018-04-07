package cn.com.arith;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class StatFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("f:/stat.txt");
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		try {
			os.write((byte)n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int i;
		int[] a=new int[n];
		int m;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		m=sc.nextInt();
		int count=0;
		for(i=0;i<n;i++){
			if(a[i]<m){
				count++;
			}
		}
		System.out.println(count);
	}
	

}
