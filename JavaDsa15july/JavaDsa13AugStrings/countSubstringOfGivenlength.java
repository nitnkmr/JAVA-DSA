package JavaDsa13AugStrings;

public class countSubstringOfGivenlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				int len=j+1-i;
				if(len==3) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
