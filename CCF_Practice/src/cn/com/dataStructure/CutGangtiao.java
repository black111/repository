package cn.com.dataStructure;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class CutGangtiao {
	
	public static void main(String[] args) {
		int n=10;
		int []a={0,1,5,8,10,13,17,18,22,25,30};
		System.out.println(cut_rod(a, 10));
	}
	
	public static int cut_rod(int []p,int n){
		if(0==n){
			System.out.println("�����������ģ��0");
			return 0;
		}
		int q=-9;
		for(int i=1;i<=n;i++){
			System.out.println("�����������ģ��"+n);
			q=max(q,p[i]+cut_rod(p, n-i));
			if (i==n){
                System.out.println("�������ģΪ "+n+" ������ֵ = "+q);
            }
		}			
		System.out.println("�ص��ڣ�"+(n+1)+"��");
        System.out.println();
		return q;	
	}
	public static int max(int p,int q){
		return p>=q?p:q;
	}
}
