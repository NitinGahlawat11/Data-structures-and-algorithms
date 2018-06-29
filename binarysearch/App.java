package binarysearch;

public class App {

	public static void main(String[] args) {
		Binarysearch( new int[] {11,15,19,23,26},26);
		

	}
public static void Binarysearch(int[]a, int x) {
	int p=0;
	int r= a.length-1;
while(p<=r) {
	int q=(p+r)/2;
	if(x>a[q]) {
		p=q+1;
	}
	else if(x<a[q]) {
r=q-1;		
	}
	else {System.out.println(" the element " + x + " is at " + q +"position ");
	}
	}
	
System.out.println("element you were looking for was not found in the list ");
}
}
