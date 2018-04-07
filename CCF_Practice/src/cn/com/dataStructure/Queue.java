package cn.com.dataStructure;

import java.util.Scanner;

public class Queue<Item>{
	private Node first;
	private Node last;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	public Queue(){
		
	}
	public void createQueue(){
		
	}
	//表尾添加元素
	public void enqueue(Item item){
		Node oldlast=last;
		last = new Node();
		last.item=item;
		last.next=null;
		if(isEmpty()) first=last;
		else oldlast.next=last;
		N++;
	}
	//从表头删除
	public Item dequeue(){
		Item item = first.item;
		first=first.next;
		if(isEmpty()) last=null;
		N--;
		return item;
	}
	public boolean isEmpty(){
		return first==null;
	}
	public int size(){
		return N;
	}
	public static void main(String[] args) {
		Queue<String> q=new Queue<String>();
		Scanner sc=new Scanner(System.in);
		String item=sc.nextLine();
		String [] items=item.split(" ");
		for(String it:items){
			if(!it.equals("-")){
				q.enqueue(it);
			}else if(!q.isEmpty()) System.out.print(q.dequeue()+" ");
		}
		System.out.println("("+q.size()+" left on queue)");
	}
}


