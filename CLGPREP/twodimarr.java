package CLGPREP;

import java.util.Scanner;

public class twodimarr {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int s[][];
        System.out.print("Enter the Rows and column :");
        int row= scan.nextInt();
        int col = scan.nextInt();
        s = new int[row][col];
        System.out.println("Enter the elements ");
        for (int i= 0; i < row; i++)
        {
            for (int j = 0; j <col; j++)
            {
                s[i][j]=scan.nextInt();
            }
        }

        for (int i = 0; i <row; i++){
            for (int j = 0; j< col; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

