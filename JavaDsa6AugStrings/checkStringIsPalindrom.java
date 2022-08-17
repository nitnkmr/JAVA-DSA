package JavaDsa6AugStrings;

import java.util.Scanner;

public class checkStringIsPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		boolean flag=false;
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			flag=true;
		}
		if(flag==true) {
			System.out.println("Palindrom");
		}
		else
			System.out.println("not Palindrom");
		

	}

}
