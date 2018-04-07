package cn.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//public class Huawei1 {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		List<String>list=new ArrayList<String>();
//		String s1=s.replaceAll("[a-z]", " ");
//		String str[]=s1.split(" ");
//		for(int i=0;i<str.length;i++){
//			if(str[i].length()>0){
//				if(str[i].charAt(0)!=' ')
//					list.add(str[i]);
//			}
//		}
//		Collections.sort(list,new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				 return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
//			}
//		});
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
//		StringBuffer sb=new StringBuffer();
//		for(int i=0;i<list.size();i++){
//			if(list.get(i).length()==list.get(list.size()-1).length())
//				{
//					sb.append(list.get(list.size()-1));
//					break;
//				}
//		}
//		if(sb.length()!=0)
//			System.out.print(sb+"\n"+list.get(list.size()-1).length());
//		else{
//			System.out.print("0");
//		}
//	}	
//}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Huawei1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(str);
		String result = "";
		while (m.find()) {
			String temp = m.group();
			if (temp.length() >= result.length()) {
				result = temp;
			}
		}
		if (result.length() == 0) {
			System.out.println("0");
			return;
		}
		System.out.println(result);
		System.out.println(result.length());
	}

}
