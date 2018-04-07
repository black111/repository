package cn.com.arith;

import java.util.Scanner;

public class PAT_1003 {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		sc.nextLine();
//		String []str=new String[n];
//		for(int i=0;i<n;i++){
//			str[i]=sc.nextLine();
//		}
//		for(int i=0;i<n;i++){
//			if (containsPAT(str[i])){
//				System.out.println("YES");
//			}else{
//				System.out.println("NO");
//			}
//		}
//	}
//	public static boolean containsPAT(String s){
//		if(s.equals("PAT")) return true;
//		if(s.contains("PAT")){
//			String substr1=s.substring(0,s.indexOf('P'));
//			String substr2=s.substring(s.indexOf('T')+1,s.length());
//			if(substr1.length()==0&&substr2.length()==0){
//				return true;
//			}else if(substr1.length()==substr2.length()){
//				int numofA=0;
//				for(int i=0;i<substr1.length();i++){
//					if(substr1.substring(i,i+1).equals("A")){
//						numofA++;
//						continue;
//					}else{
//						break;
//					}
//				}
//				if(numofA==substr1.length()&&substr1.equals(substr2)) return true;
//			}
//		}
//		if(s.contains("P")&&s.contains("T")){
//			if(s.indexOf('P')<s.indexOf('T')){
//				int numofA3=0;
//				int numofA1=0;
//				int numofA2=0;
//				String substr3=s.substring(s.indexOf('P')+1,s.indexOf('T'));
//				String substr1=s.substring(0,s.indexOf('P'));
//				String substr2=s.substring(s.indexOf('T')+1,s.length());
//				if((substr1.length()!=0&&substr2.length()!=0&&substr3.length()!=0)){
//					for(int i=0;i<substr3.length();i++){
//						if(substr3.substring(i, i+1).equals("A")) numofA3++;
//					}
//					for(int i=0;i<substr1.length();i++){
//						if(substr1.substring(i,i+1).equals("A"))numofA1++;
//					}
//					for(int i=0;i<substr2.length();i++){
//						if(substr2.substring(i,i+1).equals("A"))numofA2++;
//					}
//					if(numofA1!=0&&numofA2!=0&&numofA3!=0){
//						if(numofA3==substr3.length()&&numofA2==substr2.length()&&numofA1==substr1.length()){
//							if(numofA1*numofA3==numofA2) return true;
//						}
//					}					
//				}
//				if(substr1.length()==0&&substr2.length()==0){
//					for(int i=0;i<substr3.length();i++){
//						if(substr3.substring(i, i+1).equals("A")) numofA3++;
//					}
//					if(numofA3>0&&numofA3==substr3.length())return true;
//				}
//			}
//			
//		}
//		return false;
//	}
	public static void main1(String[] args){    
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();  
        sc.nextLine();  
        for(int i=0 ;i<n ;i++){  
            String s = sc.nextLine();  
            String news = s;  
            if(news.contains("P")&&news.contains("A")&&news.contains("T")){  
                news = news.replace("A", "");  
                news = news.replace("P", "");  
                news = news.replace("T", "");  
                news = news.replace("\\s+", "");  
                if(news.isEmpty()){  
                    int p = s.indexOf("P");  
                    int t = s.indexOf("T");  
                    int len = s.length();  
                    int b = t-p-1;  
                    int c = len -t -1;  
                    if(p*b==c){  
                        System.out.println("YES");  
                    }else{  
                        System.out.println("NO");  
                    }  
                }else{  
                    System.out.println("NO");  
                }  
            }else{  
                System.out.println("NO");  
            }  
        }  
    }  
}
