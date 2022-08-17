package JavaDsa07july;

import java.util.Scanner;

public class checkduplicateArrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt(); 
				
			}
			int check=0;
			for(int i=0;i<n-1;i++) {
				if(a[i]==a[i+1]) {
					check++;
				}
			}
			if(check>0)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}


