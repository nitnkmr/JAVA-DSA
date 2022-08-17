package JavaDsa4AugStrings;

public class printString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello everyone";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
			System.out.println("________________");
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}

}
