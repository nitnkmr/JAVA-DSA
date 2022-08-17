package JavaDsa7July;

import java.util.Scanner;

public class Arraycheckingforuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char []ch= {'A','B','C','d','E','F','a','r'};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		sc.nextLine();
		char ch[]=new char[n];
		for(int i=0;i<n;i++) {
			
		
		String s=sc.nextLine();
		ch[i]=s.charAt(0);
		}
		int count=0;
		for(int i=0;i<ch.length;i++) {
		
		if(ch[i]>='A' && ch[i]<='Z') {
			count=count+1;
		}
			
			
		}
		System.out.println(count);

	}

	}


