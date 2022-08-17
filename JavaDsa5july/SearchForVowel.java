package JavaDsa5july;

import java.util.Scanner;

public class SearchForVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		char a[]=new char[n];
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			a[i]=s.charAt(0);
			
		
		}
		int count=-1;
		for(int i=0;i<n;i++) {
//			System.out.print(a[i]);
			if(a[i]=='a' || a[i]=='e' || a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u'|| a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U') {
				count=i;
				break;
			}
		}
		System.out.println(count);

	}

}
