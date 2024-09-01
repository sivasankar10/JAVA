package basics;

import java.util.*;

public class radix {
    public static void main(String[] args) {
        String str ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value : ");
        str = in.nextLine();

        if (str.matches("[01]+")){

            System.out.println(" Binary basics.radix = 2");

        }
        else if(str.matches("[0-7]+")){
            System.out.println(" Octal basics.radix = 8");

        }
        else if (str.matches("[0-9]+")){
            System.out.println(" Decimal basics.radix = 10");
        }
        else if(str.matches("[0-9A-F]+")){
            System.out.println("basics.radix = 10");
        }
        else {
            System.out.println("invalid number ");
        }
    }
}
