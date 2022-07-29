package linkedl;

import linkedl.linkedlistll;
import linkedl.node;
//import linkedlist.Node;

class node{
	int val;
	node next;
	
	node(int data)
	{
		this.val=data;
		this.next=null;
	}
}

class linkedlistll{
	node head;
	
	linkedlistll()
	{
		this.head=null;
	}
	//TO_PRINT_A_LINKED_LIST
	 void print(){
	        node cur = this.head;
	        while(cur!=null){
	            System.out.print(cur.val+" ");
	            cur = cur.next;
	        }
	        System.out.println();
	    }
	 
	 //LENGTH_OF_LINKEDLIST
	 int length(){
	        node cur = this.head;
	        int c=0;
	        while(cur!=null){
	            c++;
	            cur = cur.next;
	        }
	       return c;
	    }
	 
	 //SEARCHING_A_KEY_VALUE
	 boolean search(int key)
	 {
		 node cur=this.head;
		 while(cur!=null)
		 {
			 if(cur.val==key)
			 {
				 return true;
			 }
			 cur=cur.next;
		 }
		 return false;
	 }
	 
//	 node middle()
//	 {
//		 node cur=this.head;
//		 int len=this.length();
//		 int mid=len/2;
//		 int p=0;
//		 while(p!=mid)
//		 {
//			 cur=cur.next;
//			 p++;
//		 }
//		 return cur;
//	 }
	 
	 node middle()
	 {
		 node slow=this.head;
		 node fast=this.head;
		 while(slow!=null && fast!=null && fast.next!=null)
		 {
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 return slow;
	 }
		 
	
	//INSERTIONATEND
	void insertatend(int data)
	{
		node cur=this.head;
		node newnode = new node(data);
		if(cur==null)
		{
			this.head=newnode;
		}
		else
		{
			while(cur.next!=null)
			{
				cur=cur.next;
			
			}
			cur.next=newnode;
		}
	}
	
	//DELETIONATEND
	void deleteatend()
	{
		node cur=this.head;
		if(cur==null||cur.next==null)
		{
			this.head=null;
		}
		else
		{
		while(cur.next.next!=null)
		{
			cur=cur.next;
		}
		cur.next=null;
		}
	}
}
public class lscopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     linkedlistll ls=new linkedlistll();
     int []nodes= {1,2,3,4,5,6,7,8,9};
     for(int val:nodes)
     {
    	 ls.insertatend(val);
     }
     ls.print();
     ls.deleteatend();
     ls.print();
     ls.length();
     System.out.println(ls.search(5));
     node mid = ls.middle();
     System.out.println(mid.val);
	}
}
