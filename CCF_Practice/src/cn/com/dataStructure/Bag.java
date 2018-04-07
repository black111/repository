package cn.com.dataStructure;

import java.util.Iterator;
import java.util.Scanner;

public class Bag<Item> implements Iterable<Item> {
	private int N;
	private Node head;
	private class Node{
		private Item item;
		private Node next;
	}

	public void add(Item item){
		Node oldhead=head;
		head=new Node();
		head.item=item;
		head=oldhead;
		N++;
	}
//	private Item[] a;
//	public void add(Item item){
//		a[++N]=item;
//	}
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public static void main(String[] args) {
		Bag<Double> numbers=new Bag<Double>();
		Scanner sc=new Scanner(System.in);
		while(sc!=null){
			numbers.add(sc.nextDouble());
		}
		int n=numbers.size();
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<Item>) new ListItearator();
	}
	private class ListItearator implements Iterable<Item>{
		private Node current= head;
		public boolean hasNext(){
			return current!=null;
		}
		public void remove(){
			
		}
		public Item next(){
			Item item=current.item;
			current=current.next;
			return item;
		}
		@Override
		public Iterator<Item> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
