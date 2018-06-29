package linearsearch;

import java.util.Scanner;

public class Ls {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]list= {1,3,5,11,12,19};
sc = new Scanner(System.in);
System.out.println("enter the element yoou wanna search");
 int find = sc.nextInt();
findElement(list,find);
	}	
	
	public static void findElement(int[]list,int find) {
		for( int i=0;i<=list.length;i++) {
			if(find==list[i]) {
				System.out.println("element found at "+ i + "position");
				
			}
			
			System.out.println("element not found");	
			
		}
		
		
		
	}

}
