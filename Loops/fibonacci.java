package Loops;
import java.util.*;

public class fibonacci {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n ;
        System.out.println("Enter the no of terms ");
        n = scan.nextInt();
        int num1 =0;
        int num2 =1;

        for (int i = 0; i<=n; i++ )
        {
            System.out.print(num1+" ");

        int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
