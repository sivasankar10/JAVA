package string;

import java.util.Scanner;

public class strings2 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String str1,str2,str3;

        System.out.println("Enter the Website name :");
        str1 = input.nextLine();


        System.out.println(str1.startsWith("www"));
        System.out.println(str1.endsWith(".com"));
        System.out.println(str1.charAt(8));
        System.out.println(str1.indexOf("."));
        System.out.println(str1.indexOf(".",4));
        System.out.println(str1.lastIndexOf("."));
    }
}
