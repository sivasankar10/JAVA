package Loops;
import java.util.*;
public class GP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a ,b,n;
        System.out.println("Enter the starting and difference value  ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("enter the number of values needed :");
        n = scan.nextInt();
        for (int i =0; i <= n; i++)
        {
            System.out.print(a+" ");
            a = a * b;
        }
    }
}
