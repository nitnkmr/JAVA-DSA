package JavaDsa9AugStrings;

import java.util.Arrays;
import java.util.Scanner;

public class printCorrespondingcharofString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s =sc.next();
		
		int temp[]=new int[26];
		int down=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int tar= (ch+('y'-down));
			char chh=(char) tar;
			down++;
			System.out.println(tar);
			System.out.println(chh);
			
		}
	

	}

}
