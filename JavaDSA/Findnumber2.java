package JavaDSA;

public class Findnumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		//int n=3;
		Find();

	}
	static void Find() {
		int counter=0;
		int i=1;
	while(counter<7) {
		if((6*i*i)%3==0) {
		counter++;
		System.out.println(i);
		}
		i++;
	}
	}
	

}

