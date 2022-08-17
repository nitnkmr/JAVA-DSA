package JavaDsa13AugStrings;

public class countSubstringStartsAndendwithSameCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ANTARTICA";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				//System.out.println(s.substring(i, j+1));
				if(s.charAt(i)=='A'&& s.charAt(j)=='A') {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
