package JavaDsa11AugStrings;

import java.util.Arrays;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdewrf";
		String s2="abdefcr";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean ana=true;
		if(c1.length==c2.length) {
		   for(int i=0;i<c1.length;i++) {
		  if(c1[i]!=c2[i]) {
			  ana=false;
			  break;
		  }
		}
		}
		else
			ana=false;
		   System.out.println(ana);
		
		
	}

}
