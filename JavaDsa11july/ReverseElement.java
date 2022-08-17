package JavaDsa11july;

import java.util.Arrays;

public class ReverseElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]=new int [a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
		a=b;
		
		System.out.println(Arrays.toString(a));

	}

}
