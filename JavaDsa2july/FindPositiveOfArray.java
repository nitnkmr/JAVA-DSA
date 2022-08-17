package JavaDsa2july;

import java.util.Scanner;

public class FindPositiveOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		sc.close();
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				count++;
			}
		}
		System.out.println(count);


	}

}
