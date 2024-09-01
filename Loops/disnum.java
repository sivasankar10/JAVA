package Loops;

import java.util.Scanner;

public class disnum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n ;
        String str ="";
        System.out.println("enter the number ");
        n = scan.nextInt();

        while(n >0)
        {
          int r = n % 10;
          n =n/10;
          str = str +r; // here we are using string because if it is a intger the trailing zeros wont be counted ! but after converting it into a string you can reverse the index and print it
//            System.out.println(r);
        }

        for (int i = str.length()-1; i >= 0; i--)
        {
            char c =str.charAt(i);

            switch(c)
            {
                case '0':
                    System.out.println("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven  ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
            }
        }
    }
}
