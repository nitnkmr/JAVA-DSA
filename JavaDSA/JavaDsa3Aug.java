package JavaDSA;

import java.util.Arrays;

public class JavaDsa3Aug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{1,7,4},{7,4,8}};
		int row=a.length;
		int col=a[0].length;
		for (int i = 0; i < col; i++) {
            int j = 0;
            int k = col - 1;
            while (j < k) {
                int temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
                j++;
                k--;
            }
        }
        //printing rotated array
        System.out.println("Rotated Array :");
        for(int i=0;i<row;i++) {
            for(int j=i;j<col;j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

	}

}
