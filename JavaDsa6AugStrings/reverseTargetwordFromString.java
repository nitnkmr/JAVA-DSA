package JavaDsa6AugStrings;

import java.util.Scanner;

public class reverseTargetwordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		String []a=s1.split(" ");
		for(int i=0;i<a.length;i++) {
			String val=a[i];
			if(val.contentEquals(s2)) {
				String rev="";
				for(int j=a.length-1;j>=0;j--) {
					s2=s2+rev+" ";
				}
			
			}
			else
				s2=s2+val+" ";
			
		}
		System.out.println(s2);
		
	
			


	}

}
