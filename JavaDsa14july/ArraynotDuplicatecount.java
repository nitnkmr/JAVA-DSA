package JavaDsa14july;

public class ArraynotDuplicatecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,3,4,4,5,5};
		int xor=0;
		for(int i=0;i<a.length;i++) {
			xor=xor^a[i];
		}
		System.out.println(xor);

	}

}
