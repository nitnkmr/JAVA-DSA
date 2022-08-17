package JavaDsa6AugStrings;

import java.util.Scanner;

public class checks1Ands2isequalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		boolean flag=false;
		if(s1.equalsIgnoreCase(s2))
			flag=true;;
		System.out.println(flag);

	}

}
