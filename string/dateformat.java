package string;

import java.util.*;

public class dateformat{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String dt;
        System.out.println("Enter your date of birth");
        dt = scan.nextLine();

        System.out.println(dt.matches("[0-3][0-9]/[0-1][0-9]/[0-9]"));
    }
}