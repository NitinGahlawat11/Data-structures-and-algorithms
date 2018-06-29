package ds.linkedlist;

public class SingleLinkedList {
private Node first;

 public SingleLinkedList() {
	 
 }
  public boolean isEmpty() {
	  return(first==null);
  }

public void insertFirst(int data) {
	Node newNode= new Node();
	newNode.data=data;
	newNode.next=first;
	first=newNode;
}

public void insertLast(int data) {
	Node current= first;
	while(current.next!=null) {
		current=current.next;
	}
	Node newNode= new Node();
	newNode.data=data;
	current.next=newNode;
}




public Node deleteFirst() {
	Node temp =first;
	first=first.next;
	return temp;
}
public void displayList() {
	System.out.println("first---last");
	Node current=first;
	while(current!=null) {
		current.display();
		current=current.next;
	}
	System.out.println();
}






}