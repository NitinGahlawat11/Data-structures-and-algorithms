package ds.queue;

public class App {

	public static void main(String[] args) {
		Node a = new Node();
		a.data=5;
		Node b= new Node();
		b.data=7;
		Node c= new Node();
		c.data=9;
		Node d= new Node();
		d.data=11;
		a.next=b;
		b.next=c;
		c.next=d;
		
		System.out.println(listlength(a));
		System.out.println(listlength(c));
		
		
		
		
		
		// TODO Auto-generated method stub

	}
public static int  listlength(Node anode) {
	int length=0;
	Node current= anode;
	while(current!=null){
		length++;
		current=current.next;
	}
	return length;
}

}
