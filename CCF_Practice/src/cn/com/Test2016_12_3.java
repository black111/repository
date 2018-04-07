package cn.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2016_12_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		sc.nextLine();
		String []privileges=new String[p];
		for(int i=0;i<p;i++){
			privileges[i]=sc.nextLine();//权限
		}			
		int r=sc.nextInt();
		sc.nextLine();
		String []roles=new String[r];
		for(int i=0;i<r;i++){
			roles[i]=sc.nextLine();//角色
		}
		int u=sc.nextInt();		
		sc.nextLine();
		String []users=new String[u];
		for(int i=0;i<u;i++){
			users[i]=sc.nextLine();//用户
		}
		int q=sc.nextInt();
		sc.nextLine();
		String []findPri=new String[q];
		for(int i=0;i<q;i++){
			findPri[i]=sc.nextLine();//权限查询
		}
		
		for(int i=0;i<findPri.length;i++){
			boolean bool1=false;
			boolean bool2=false;
			boolean bool3=false;
			String []str=findPri[i].split(" ");
			String user=str[0];
			String pri=str[1];			
			if(pri.contains(":")){
				int q_grade=Integer.valueOf(pri.substring(pri.indexOf(":")+1));
				pri=pri.substring(0, pri.indexOf(":"));
				
			}
			for(int j=0;j<u;j++){
				String []s=users[j].split(" ");
				String u_user=s[0];
				int u_role_num=Integer.valueOf(s[1]);
				String u_role[]=new String[u_role_num];
				for(int m=0;m<u_role_num;m++){
					u_role[m]=s[2+m];
				}
				if(user.equals(u_user)) {
					bool1=true;
					for(int k=0;k<r;k++){
						bool2=false;
						for(int k1=0;k1<u_role_num;k1++){							
							if(roles[k].contains(u_role[k1])){
								bool2=true;								
//								for(int k2=0;k2<p;k2++){	
									bool3=false;
									if(roles[k].contains(pri)){
										bool3=true;
										break;
									}
//								}
							}
						}
					}
				}
				
			}
			if(bool1&&bool2&&bool3){
				System.out.println(true);
			}else{
				System.out.println(false);
			}
		}
	}		
}

