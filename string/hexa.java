package string;

import java.util.*;

public class hexa {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String str1 = "10F";
        if (str1.matches("[0-9A-F]+")){
            System.out.println("It is an HEXA-DECIMAL "+str1);
        }
        else {
            System.out.println("Non HEXA-DECIMAL"+str1);
        }
    }
}
