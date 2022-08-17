package JavaDsa10AugStrings;

public class searchWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello everyone we We are good here";
		s=s.toLowerCase();
		String s1[]=s.split(" ");
		int count=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].contains("we")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
