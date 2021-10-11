package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList mylist = new SinglyLinkedList();
		mylist.insertFirst(100);
		mylist.insertFirst(10);
		mylist.insertFirst(800);
		mylist.insertFirst(210);
		mylist.insertFirst(110);
		mylist.insertFirst(100);
		
		mylist.insertLast(888888);
		
		mylist.displayList();

	}

}
