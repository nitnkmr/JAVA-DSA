package JavaDsa8AugStrings;

import java.util.Scanner;

public class reverseEveryWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) {
			char ch[]=a[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
			
		}

	}

}
