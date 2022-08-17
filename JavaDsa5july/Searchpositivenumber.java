package JavaDsa5july;

import java.util.Scanner;

public class Searchpositivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int count=-1;
		for(int i=0;i<n;i++) {
			if(ar[i]>0){
				count=i;
			}
		}
		if(count<0) {
			System.out.println("-1");
		}
		else {
			System.out.println(count);
		}

	}

}
