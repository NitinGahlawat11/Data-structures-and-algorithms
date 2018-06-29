package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinarySearch(new int[] {11,13,7,5,26,23},0,5,5);
	}
public static int BinarySearch(int[]a,int p,int r, int x) {
	if(p>r) {
		System.out.println("element not found");
		return -1;
	}
	else {
		int q=(p+r)/2;
		if(a[q]==x) {
			System.out.println("element found at " + q);
			return q;
		}
		else  if(a[q]>x) {
		return BinarySearch(a,p,q-1,x);
		} 
		else {
			return BinarySearch(a,q+1,r,x);
		}
		}
	}
	
}

