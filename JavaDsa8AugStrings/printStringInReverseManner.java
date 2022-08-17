package JavaDsa8AugStrings;

import java.util.Scanner;

public class printStringInReverseManner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s[]=s1.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}

	}

}
