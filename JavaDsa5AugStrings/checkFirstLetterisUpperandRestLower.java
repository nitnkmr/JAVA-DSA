package JavaDsa5AugStrings;

import java.util.Scanner;

public class checkFirstLetterisUpperandRestLower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		boolean ideal = true;

			char ch1 = str.charAt(0);
			if (!Character.isUpperCase(ch1)) {
				ideal = false;
				return;
			}

			for (int i = 1; i < str.length(); i++) {
				char c = str.charAt(i);
				if (!Character.isLowerCase(c)) {
					ideal = false;
					break;
				}
			}
		System.out.println(ideal);

	}

}
