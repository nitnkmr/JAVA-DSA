package JavaDsa13july;

import java.util.Arrays;

public class PrintEvenFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		int n=a.length;
		int i=0;
		int j=n-1;
		while(i<=j) {
			if(a[i]%2==0) {
				i++;
			}
			 if(a[j]%2==1) {
				j--;
			}
			 if(a[i]%2==1 && a[j]%2==0 && j>i) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
