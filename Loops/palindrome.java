package Loops;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            int n , r =0 , rem =0;

            System.out.println("Enter the Number ");
            n =scan.nextInt();

            int og =n;
            while(n>0){
                r =  n % 10;
                rem = rem *10 +r;
                n = n /10;
            }

            if (og == rem){
                System.out.println("it is a palindrome number ");
            }
            else {
                System.out.println("Illapa thambi");
            }
        }
    }
}