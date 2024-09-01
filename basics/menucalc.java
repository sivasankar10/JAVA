package basics;

import java.util.*;


public class menucalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opr;
        int a ,b;
        System.out.println("FUNCTIONS\n ADD\n SUB\n DIV \n MUL");
        System.out.println("Enter two numbers :");
        a = scan.nextInt();
        b = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the operation :");
        opr = scan.nextLine();

        switch (opr){
            case "ADD":
                System.out.println(a + b);
                break;
            case "DIV":
                System.out.println(a / b);
                break;
            case "MUL":
                System.out.println(a * b);
                break;
            case "SUB":
                System.out.println(a - b);
                break;
        }

    }
}
