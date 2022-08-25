package java_dsa_24_Aug;

import java.util.Scanner;

public class LCM_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		for(int i=1;i<max;i++) {
			int mul=max*i;
			if(mul%min==0) {
				System.out.println(mul);
				break;
			}
		}
			

	}

}
