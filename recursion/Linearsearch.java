package recursion;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinearSearch( new int [] {11,15,17,16,13,11},0,91);
	}
public static int LinearSearch(int[]a,int i , int x) {
	if(i>a.length-1) {
		System.out.println("element not found");
		return -1;
		}
	else if(a[i]==x) {
		System.out.println("found at " + i);
		return i;
		
	}
	else {
		 return LinearSearch(a,i+1,x);
	}
}
}
