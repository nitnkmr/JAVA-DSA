package JavaDsa13AugStrings;

public class printAllSubstringofAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				System.out.println(s.substring(i, j+1));
			}
		}

	}

}
