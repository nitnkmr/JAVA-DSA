package JavaDsa11july;

import java.util.Scanner;

public class SortZerooneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=true;
		int i=0;
		int j=n-1;
		while(i<=j) {
			if(a[i]==0) {
				i++;
			}
			if(a[j]==1) {
			    j--;
			}
			if(a[i]==1 && a[j]==0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
				j--;
			}
		}
			for(int k=0;k<n;k++)
			System.out.print(a[k]);

	
	}
}
