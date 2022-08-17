package JavaDsa16july;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==target) {
					
					System.out.println(i+","+j);
				}
			}
		}
					

	}

}
