package Loops;
import java.util.*;

public class reversenum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ;
        System.out.println("Enter the Number ");
        n = scan.nextInt();
        int r =0;
        int rem = 0;
        while(n>0)
        {
            r = n % 10;
            rem = rem * 10 + r;
            n = n /10;
        }

        System.out.println(rem);




    }
}
