package JavaDsa9AugStrings;

public class chechPangramwithHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Abcdefghij klmnopqrstuvwxyz";
				s1=s1.toLowerCase();
				int temp[]=new int[26];
				for(int i=0;i<s1.length();i++) {
					char ch=s1.charAt(i);
					if(ch>='a'&& ch<='z') {
					int ind=ch-'a';
					temp[ind]=temp[ind]+1;
					}
				}
				boolean isPangam=true;
				for(int i=0;i<temp.length;i++) {
					if(temp[i]<1) {
						isPangam=false;
					}
					
				}
				System.out.println(isPangam);

	}

}
