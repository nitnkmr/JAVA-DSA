package JavaDsa01Augest;

import java.util.Arrays;
import java.util.Scanner;

public class SortTwoDArray {

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
        int temp[]=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
            temp[k]=a[i][j];
            k++;
            }
            }
        Arrays.sort(temp);
        int t=0;
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
            a[i][j]=temp[t]; 
            t++;
            }
            }
        
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");	
            }
            System.out.println();
            }

	}

}
