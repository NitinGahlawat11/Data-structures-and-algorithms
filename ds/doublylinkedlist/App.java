package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(65);
		dll.insertFirst(68);
		dll.insertFirst(77);
		dll.displayForward();
		
		dll.insertAfter(68, 70);
		dll.displayForward();
		dll.deleteFirst();
		dll.displayForward();
		dll.insertLast(88);
		dll.insertLast(84);
		dll.displayForward();
		dll.deleteLast();
		dll.displayForward();
		dll.deleteKey(70);
		dll.displayForward();

	}

}
