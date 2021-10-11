/*Header: Node.java
 * 
 * Author: Lindi Mallory
 * 
 * Brief program description: Utilizes the Node class to create a more dynamic way of
 * storing data other than arrays
 * Singly list is one directional list of nodes, cannot go backwards
 */

package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first; // first currently points to NULL

	//constructor
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return(first==null);// this means we have no more nodes connected to the list
	}
	
	//used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current !=null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next; // we will loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		
	}
}
