package JavaDsa13AugStrings;

public class countSubstringofEvenkength {

	public static void main(String[] args) {
		String s="abcd";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String s1=s.substring(i, j+1);
				if(s1.length()%2==0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
