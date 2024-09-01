package basics;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {


        int a,b,c ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value :");
         a = in.nextInt();
        System.out.println("Enter b value :");
        b = in.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("value of a is :"+a);
        System.out.println("value of b is :"+b);



    }
}
