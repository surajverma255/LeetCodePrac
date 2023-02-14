package LinkedListOwn;

public class MyLinkedList {
	
	private static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	//-------Inserting new Node----------
	private Node head;
	public void add(int data) {
		Node toInsert= new Node(data);
		if(head==null) {
			head= toInsert;
			return;
		}
		
		Node temp= head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=toInsert;
	} 
	
	//-------------print my Linkedlist--------------
	public void print() {
		Node temp= head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
