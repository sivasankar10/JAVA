package string;

import java.util.*;

public class strings {
     public  static void main(String args []){
         String str1 ,str2,str3;

         Scanner in = new Scanner(System.in);

         System.out.println("Enter the line :");
         str1 = in.nextLine();
         str1 = str1.toLowerCase();
         System.out.println(str1);

         System.out.println("AgainEnter it :");
         str2 =in.nextLine();
         str2 =str2.replace('e','c');
         System.out.println(str2);

         System.out.println("Again : ");
         str3= in.nextLine();
         str3 = str3.substring(4);
         System.out.println(str3);

     }

}
