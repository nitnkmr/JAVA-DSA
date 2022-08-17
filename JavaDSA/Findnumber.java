package JavaDSA;

public class Findnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int n=4;
		Find();

	}
	static void Find() {
		int counter=0;
		int i=1;
	while(counter<3) {
		if((4*i+3)%3==0) {
		counter++;
		System.out.println(i);
		}
		i++;
	}
	}
	

}
