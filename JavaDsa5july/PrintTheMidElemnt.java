package JavaDsa5july;

import java.util.Scanner;

public class PrintTheMidElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n/2;i++) {
			temp=ar[i];
		}
		System.out.println(temp);
		

	}


	

}
