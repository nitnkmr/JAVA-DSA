package JavaDsa4AugStrings;

public class CountTheSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to the session";
       char c[]= s.toCharArray();
       int count=0;
		for(int i=0;i<c.length;i++) {
        	if(c[i]==' ') {
        		count++;
        	}
        }
		System.out.println(count);
	}

}
