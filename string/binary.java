package string;//import java.util.Scanner;
import java.util.*;

public class binary {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a  = 8;
        String str = String.valueOf(a);
//        System.out.println(str.matches("[01]+"));

        if (str.matches("[01]*")){
            System.out.println("yes it is a oops.binary number ");
        }
        else {
            System.out.println("non oops.binary");
        }



    }
}
