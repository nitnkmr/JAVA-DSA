package JavaDsa01Augest;

import java.util.Scanner;

public class CheckpalindromicRowsinMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                a[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<m;i++){

            int j=0;
            int k=n-1;
            boolean flag=true;
            while(j<k){
                if(a[i][j]!=a[i][k]){

                    flag=false;
                    break;
                    
                }
                j++;
                k--;
            }
            if(flag){
                count++;
            }
     }
        System.out.println(count++);
}
}
