package JavaDsa15july;

public class RevwrseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,9};
		int b[]=new int[a.length];
		int j=0;
		for(int i=a.length+1;i>=0;i++) {
			b[j]=a[a.length-1-i];
			j++;
			System.out.print(a[i]+" ");
		}

	}

}
