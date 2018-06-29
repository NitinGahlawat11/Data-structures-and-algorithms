package sorting;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarr= insertion(new int[] {11,13,7,9,15,5,21});
for(int i=0;i<=myarr.length;i++) {
System.out.println(myarr[i]);
}
	}
public static int[] insertion(int[]a) {
	for(int i=1;i<a.length-1;i++) {
		int element=a[i];
		int j=i-1;
		while(j>=0 &&a[j]>element) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]= element;
	}
	return a;
} 
		}
