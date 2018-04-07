package cn.com.arith;

import java.util.Scanner;

public class PAT_1004 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			Student []stu=new Student[n];
			for(int i=0;i<n;i++){
				Student s=new Student();
				s.setStuName(sc.next());
				s.setStuNo(sc.next());
				s.setStuGrade(sc.nextInt());
				stu[i]=s;
			}
			int min,max;
			min=max=stu[0].getStuGrade();
			Student maxstu=stu[0];
			Student minstu=stu[0];
			for(int i=1;i<n;i++){
				if(stu[i].getStuGrade()>max) {
					max=stu[i].getStuGrade();
					maxstu=stu[i];
				}
				if(stu[i].getStuGrade()<min){
					min=stu[i].getStuGrade();
					minstu=stu[i];
				}
			}
			System.out.println(maxstu.getStuName()+" "+maxstu.getStuNo());
			System.out.println(minstu.getStuName()+" "+minstu.getStuNo());
		}
		
}
class Student{
	private String stuName;
	private String stuNo;
	private int stuGrade;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public int getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(int stuGrade) {
		this.stuGrade = stuGrade;
	}
	
}
