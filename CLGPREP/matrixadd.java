package CLGPREP;
import java.util.*;
public class matrixadd {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int f[][];
        int s[][];
        int r[][];
        System.out.println("Enter the row and column :");
        int row = scan.nextInt();
        int col = scan.nextInt();
        f = new int[row][col];
        s = new int[row][col];
        r = new int[row][col];
        System.out.println("Enter the first matrix: ");
        int i , j;
        for (i = 0; i < row; i++){
            for (j =0; j<col; j++){
                f[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for (i = 0; i < row; i++){
            for (j =0; j<col; j++){
                s[i][j]=scan.nextInt();
            }
        }

      for (i = 0; i <row; i++){
          for (j = 0; j <col; j++){
              r[i][j]= f[i][j]+s[i][j];
              System.out.print(r[i][j]+" ");
          }
         System.out.println();
      }
    }
}
