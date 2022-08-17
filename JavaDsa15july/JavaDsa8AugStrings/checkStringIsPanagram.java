package JavaDsa8AugStrings;

import java.util.Scanner;

public class checkStringIsPanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		boolean flag=true;
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(ch+"")) {
				flag=false;
			}
		}
		
		System.out.println(flag);


	}

}
