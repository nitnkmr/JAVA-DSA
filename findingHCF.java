package java_dsa_24_Aug;

import java.util.Scanner;

public class findingHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int factor=0;
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		for(int i=min;i<=max;i++) {
			if(max%i==0) {
		    factor=i;
			}
			if(factor%min==0) {
				System.out.println(factor);
				break;
			}
		}

	}

}
