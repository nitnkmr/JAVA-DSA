package JavaDsa13july;

import java.util.Arrays;

public class CharSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'a','b','C','d','E','f','F','J'};
		int n=a.length;
		int i=0;
		int j=n-1;
		while(i<=j) {
			if(a[i]>='a' && a[i]<='z') {
				i++;
			}
			if(a[j]>='A' && a[j]<='Z') {
				j--;
			}
			if(a[i]>='A' && a[i]<='Z' && a[j]>='a' && a[j]<='z' && i<j) {
				char temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
