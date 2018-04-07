package cn.com;

import java.util.Scanner;
public class Test_2017_03_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=null;
		String str=null;
		String text="";
		int start,end;
		while(sc.hasNextLine())
		{
			line=sc.nextLine();
			if(line==null || line.length()==0){
				if(str==null){
					continue;
				}
				
				if(str.contains("<h")){
					System.out.print(str);
				}else if(str.contains("<ul>")){
					str +="\n"+"</ul>"+"\n";
					System.out.print(str);
				}else if(str.contains("<p>")){
					str +="</p>"+"\n";
					System.out.print(str);
				}
				str=null;
				continue;
			}
			while((start=line.indexOf("_"))!=-1){
				end=line.indexOf("_", start+1);
				text=line.substring(start, end+1);
				line=line.replace(text, "<em>"+text.substring(1, text.length()-1)+"</em>");
			}
			while((start=line.indexOf("["))!=-1){
				end=line.indexOf("]",start+1);
				text=line.substring(start+1,end);
				int startHref=line.indexOf("(",end);
				int endHref=line.indexOf(")",startHref);
				String href=line.substring(startHref+1,endHref);
				line=line.replace("["+text+"]"+"("+href+")", "<a href=\""+href+"\""+">"+text+"</a>");
			}
			int num=0;
			if(line.startsWith("#")){
				while(line.startsWith("#") && num<=6){
					line=line.substring(1);
					num++;
				}
				while(line.startsWith(" ")){
					line=line.replaceFirst(" ", "");
				}
				str="<h"+num+">"+line+"</h"+num+">"+"\n";
			}
			else if(line.startsWith("*")){
				line=line.substring(1);
				while(line.startsWith(" ")){
					line=line.substring(1);
				}
				if(str==null){
					str="<ul>"+"\n"+"<li>"+line+"</li>";
				}else{
					str+="\n"+"<li>"+line+"</li>";
				}
				
			}
			else{
				if(str==null){
					str="<p>"+line;
				}else{
					str+="\n"+line;
				}
			}
		}
		if(str.contains("<h")){
            System.out.print(str);
        }else if(str.contains("<ul>")){
        	str += "\n"+"</ul>"+"\n";
            System.out.print(str);
        }else if(str.contains("<p>")){
        	str += "</p>"+"\n";
            System.out.print(str);
        }
	}
}
