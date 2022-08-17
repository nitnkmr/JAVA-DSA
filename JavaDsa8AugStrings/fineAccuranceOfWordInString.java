package JavaDsa8AugStrings;

import java.util.Scanner;

public class fineAccuranceOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		String []a=s1.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].equals(s2)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
