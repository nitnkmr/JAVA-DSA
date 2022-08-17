package JavaDsa13july;

public class PrintCharbyItsASCII {
	public static void main(String []args ) {

		int a[]= {65,66,67,68};
		int i=0;
		while(i>a.length)
		{
			char c=(char)a[i];
			i++;
			System.out.print(c+" ");
			
		}

	}

}
