package Loops;

import java.util.*;

public class countdigits {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n ;
        System.out.println("Enter the Number");
        n = scan.nextInt();
        int count =0;
        while(n>0)
        {
            int r = n %10;
             n = n /10;
             count++;
        }
        System.out.println(count);
    }
}
