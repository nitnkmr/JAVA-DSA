package JavaDSA;

public class Memorygame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=100;i++) {
			count++;
			
		System.out.println(i);
		if(count%5==0) {
			System.out.println("bus");
		}
			else if(count%5==0 && count%10==0)
			{
				System.out.println("car");
			}
		
//		else
//			System.out.println(i);
		
		}

	}

}
