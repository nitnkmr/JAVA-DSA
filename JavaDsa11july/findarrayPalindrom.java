package JavaDsa11july;

import java.util.Scanner;

public class findarrayPalindrom {

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
		while(i<j) {
			if(a[i]==a[j]) {
				i++;
			    j--;
			}
			else 
				flag=false;
				break;
			
		}
		if(flag==true)
			System.out.println("palindrom Array");
		
		else
			System.out.println("not palindrom array");

	}

}
