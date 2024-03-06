import java.util.*;

public class Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, m, p, q;
        System.out.println("Enter the number of row in first matrix");
        n = sc.nextInt();

        System.out.println("Enter the number of column in first matrix");
        m = sc.nextInt();

        System.out.println("Enter the number of row in second matrix");
        p = sc.nextInt();

        System.out.println("Enter the number of column in second matrix");
        q = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[p][q];
        int[][] c = new int[n][q]; // result matrix is row is equal to first matrix and
        // col is equal to second matrix

        System.out.println("Enter the element in first matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                a[i][m] = sc.nextInt();
            }
        }

        System.out.println("Enter the element in second matrix");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {

                b[p][q] = sc.nextInt();
            }
        }
       
        if (n != q) {
            System.out.println("The multplication is not possible");

        } else {
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < q; j++) {
                    int sum = 0;
                    for (int k = 0; k < p; k++) {
                        sum=sum+a[i][k]*b[k][j];
                        

                    }
                    c[n][q]=sum;

                }
            }

        }

        for(int i=0; i<n; i++){
            for(int j=0; j<q; j++){

                System.out.print(c[i][j]);
            }
            System.out.println();
        }

    }
}
