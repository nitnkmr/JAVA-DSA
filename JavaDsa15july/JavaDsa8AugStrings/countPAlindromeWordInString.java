package JavaDsa8AugStrings;

import java.util.Scanner;

public class countPAlindromeWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		sc.close(); 
		int count=0;
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String word=a[i];
			String temp="";
			for(int j=word.length()-1;j>=0;j--)
			{
				temp=temp+word.charAt(j);
			}
			if(word.equals(temp))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
