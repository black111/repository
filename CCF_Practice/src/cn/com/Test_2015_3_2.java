package cn.com;
import java.util.Scanner;
public class Test_2015_3_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int x;
		int a[]=new int[1005];
		for(int i=0;i<n;i++){
			x=sc.nextInt();
			a[x]++;
		}
		for(int i=1004;i>0;i--){
			for(int j=0;j<1005;j++){
				if(a[j]==i){
					System.out.println(j+" "+a[j]);
				}
			}
		}
		
	}
}
//��Ŀ������n����������ͳ�Ƴ�ÿ���������ֵĴ����������ִ����Ӷൽ�ٵ�˳�����
//1 �� n �� 1000�������������ǲ�����1000�ķǸ�����
//������ 12
// 5 2 3 3 1 3 4 2 5 2 3 5
//����� 3 4
//    2 3
//    5 3
//    1 1
//    4 1

