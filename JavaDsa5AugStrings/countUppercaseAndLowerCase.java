package JavaDsa5AugStrings;

import java.util.Scanner;

public class countUppercaseAndLowerCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
        int Cap=0;
        int Small=0;

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (Character.isLowerCase(c)) {
					Cap++;
				}
				else if(Character.isUpperCase(c)) {
					Small++;
				}
			}
		System.out.println("Uppercase:-  "+Cap);
		System.out.println("lowercase:-  "+Small);

	}

}
