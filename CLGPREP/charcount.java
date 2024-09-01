package CLGPREP;
import java.util.*;
public class charcount {
    public static void main(String args[]){
        String str1 ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string with space atlast:");
        str1 = scan.nextLine();

        StringBuilder cc = new StringBuilder();
        int count=1;

        for(int i =1; i <=str1.length()-1; i++)
        {
           if(str1.charAt(i)==str1.charAt(i-1))
           {
               count++;
           }
           else {
               cc.append(str1.charAt(i-1)).append(count);
               count = 1;
           }

        }
        System.out.println(cc);




    }

}
