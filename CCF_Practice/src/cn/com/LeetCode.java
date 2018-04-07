package cn.com;


public class LeetCode {
    public int[] twoSum(int[] nums, int target) {
       
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
      
    }
    public static int reverse(int x) {
    	boolean flag=false;
    	if(x<0){
    		flag=true;
    		x=-x;
    	}
    	String str=String.valueOf(x);
    	StringBuilder builder=new StringBuilder(str);
    	builder.reverse();
    	String s1=new String(builder);
    	Integer result;
    	try {
			result=Integer.valueOf(s1);
		} catch (Exception e) {
			// TODO: handle exception
			result=0;
		}
    	return flag?-result:result;
     }
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        StringBuffer str=new StringBuffer(s);
        String s2=new String(str.reverse());
        return s2.equals(s)?true:false;
    }
    public static void main(String[] args) {
    	ListNode l=new ListNode(0);
    	ListNode head=l;
    	
    	for(int i=0;i<5;i++){    		
    		ListNode l1=new ListNode(i+1);
    		l.next=l1;
    		l=l1;
    	}
    	while(head!=null){
    		System.out.println(head.val);
    		head=head.next;
    	}
	}
}

// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode l=head;
        while(l1!=null&&l2!=null){
        	if(l1.val<=l2.val){
//        		l.next=l1;
        		l=l1;
        		l1=l1.next;
        	}else{
//        		l.next=l2;
        		l=l2;
        		l2=l2.next;
        	}
        	if(l1==null){
        		l.next=l2;
        	}
        	if(l2==null){
        		l.next=l1;
        	}
        }
        return head.next;
    }
}