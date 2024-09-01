package basics;//import java.util.Scanner;
//
//public class basics.encryption {
//    public static void main(String[] args)
//    {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter the number 1");
//        int n= input.nextInt();
//        System.out.println("enter the nuumber 2:");
//        int m= input.nextInt();
//        System.out.println("enter the size of the flag stone");
//        int a=input.nextInt();
//        int flagstones=Math.round((n*m)/(a*a));
//        System.out.println(flagstones);
//
//    }
//
//}

import java.util.Scanner;

public class encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number 1 :");
        int n = input.nextInt();
        System.out.println("Enter number 2 :");
        int m = input.nextInt();
        System.out.println("enter the size of the flag stone : ");
        int a = input.nextInt();
        int flagstones= Math.round((n*m)/(a*a));
        System.out.println(flagstones);
    }
}
//
//
//
//
//
//
//
//
//
//
//
