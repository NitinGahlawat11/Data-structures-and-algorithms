package sorting;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {11,12,7,6,13,12,9,23,45,41};
Quick(arr,0,arr.length-1);
System.out.println(Arrays.toString(arr));
	}

	public static void Quick(int[]arr, int start, int end) {
if(start<=end) {
		int pp=partion(arr,start,end);
Quick(arr,0,pp-1);
Quick(arr,pp+1,end);
}
	}


public static int partion(int[]arr,int start,int end) {
	int pivot=arr[end];
	int i=start-1;
	for(int j=start;j<=end-1;j++) {
		if(arr[j]<=pivot) {
			i++;
			int ival=arr[i];
			int jval=arr[j];
			arr[i]=jval;
			arr[j]=ival;
		}
	}
	int ival=arr[i+1];
	arr[end]=ival;
	arr[i+1]=pivot;
	return i+1;
	
}



}
	
	

