package cn.com.dataStructure;

import java.util.Scanner;

public class Stack<Item> {
	private Node top;
	private int N;
	private class Node{
		private Item item;
		private Node next;
	}
	public Stack(){
		Node top=null;
	}
	//向栈顶添加元素
	public void push(Item item){
		Node oldtop=top;
		top=new Node();
		top.item=item;
		top.next=oldtop;
		N++;
	}
	public Item pop(){
		Item item=top.item;
		top=top.next;
		N--;
		return item;
	}
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> ops =new Stack<String>();//运算符号栈
		Stack<Integer> vals=new Stack<Integer>();//运算数栈
		String s="(1+((2+3)*(4*5))-9)";
		for(int i=0;i<s.length();i++){
			String str = s.valueOf(s.charAt(i));
			if(str.equals("(")) ;
			else if(str.equals("+"))
				ops.push(str);
			else if(str.equals("-"))
				ops.push(str);
			else if(str.equals("*"))
				ops.push(str);
			else if(str.equals("/"))
				ops.push(str);
			else if(str.equals(")")){
				String op=ops.pop();
				int val=vals.pop();
				if (op.equals("+")) {val=vals.pop()+val;System.out.println(val);}
				else if(op.equals("-")){val=vals.pop()-val;System.out.println(val);}
				else if(op.equals("*")){ val=vals.pop()*val;System.out.println(val);}
				else if(op.equals("/"))val= vals.pop()/val;
				vals.push(val);
			}else{
				vals.push(Integer.parseInt(str));
			}
		}
		System.out.println(vals.pop());

	}
}
