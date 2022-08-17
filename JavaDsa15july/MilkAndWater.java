package JavaDsa15july;

import java.util.Arrays;
import java.util.Scanner;

public class MilkAndWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		int b[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				
				b[j]=a[i];
				
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				
				b[j]=a[i];
				
				j++;
			}
			
		}
		
		System.out.println(Arrays.toString(b));

	

	}
}
