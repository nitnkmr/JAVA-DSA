package JavaDsa16july;

import java.util.Scanner;

public class CountLeader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int j=0;j<n;j++) {
			int leader=a[j];
			boolean ifleader=true;
		for(int i=j+1;i<n;i++) {
			if(a[j]>a[i]) {
				ifleader=false;
				continue;
			}
			else
				ifleader=true;
			break;
		}
		if(ifleader==true)
			System.out.println(leader);
		}
	}

}
