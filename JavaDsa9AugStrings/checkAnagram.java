package JavaDsa9AugStrings;

import java.util.Arrays;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ababab";
		String s2 = "babqaba";

		int a[] = new int[26];
		int b[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int ind = ch - 'a';
			a[ind] = a[ind] + 1;
			char ch2 = s2.charAt(i);
			int ind2 = ch2 - 'a';
			b[ind2] = b[ind2] + 1;
		}
		
		boolean freq = true;
		for (int i = 0; i < 26; i++) {
			if (a[i] != b[i]) {
				freq = false;

			}

		}
		System.out.println(freq);

	}

}
