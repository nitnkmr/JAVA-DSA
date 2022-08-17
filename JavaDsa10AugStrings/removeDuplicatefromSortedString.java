package JavaDsa10AugStrings;

public class removeDuplicatefromSortedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbbcccdddeeeff";
		char[]a=s.toCharArray();
		for(int i=1;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.print(a[i]);
			}
		}
			System.out.print(a[a.length-1]);

	}

}
