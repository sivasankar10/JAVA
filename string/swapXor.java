package string;

import java.lang.*;
import java.util.Scanner;

public class swapXor {
    public static void main(String[] args) {
        int a ,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        a = sc.nextInt();
        System.out.println("Enter b value : ");
        b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("value of a ="+a);
        System.out.println("value of b ="+b);

    }
}


