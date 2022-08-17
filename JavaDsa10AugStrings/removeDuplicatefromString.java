package JavaDsa10AugStrings;

public class removeDuplicatefromString {

	public static void main(String[] args) {
		String s="abbbccderrrf";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		    
		    if(!s1.contains(ch+"")) {
		    	s1=s1+ch;
		    }
		}
		    System.out.print(s1);
			
		

	}

}
