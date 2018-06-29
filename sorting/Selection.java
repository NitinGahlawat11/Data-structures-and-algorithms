package sorting;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]myarr= selection(new int []{11,16,7,12,01,23,19});
	for(int i=0;i<=myarr.length;i++) {
		System.out.println(""+myarr[i]);
	}
	}
public static int[] selection(int a[]) {
	for(int i=0;i<a.length;i++) {
		int min= i;
	for(int j=i+1;j<a.length;j++) {
		if(a[j]<a[min]) {
	        min=j;
		}
	}
	
	int temp=a[i];
	a[i]=a[min];
	a[min]=temp;
	}
	return a;
}
}
