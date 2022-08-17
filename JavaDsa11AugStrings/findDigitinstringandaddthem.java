package JavaDsa11AugStrings;

public class findDigitinstringandaddthem {

	public static void main(String[] args) {
		  String s = "a1gh674e";
	        int sum =0;
	        for(int i=0;i<s.length();i++){
	            char  ch = s.charAt(i);
	            if(Character.isDigit(ch)){
	                sum  = sum + ch - '0';
	                }
	            }System.out.println(sum);

		

	}

}
