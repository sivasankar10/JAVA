package CLGPREP;
import java.sql.SQLOutput;
import java.util.*;
public class strpalindrome {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Word :");
        StringBuilder pal =new StringBuilder(scan.nextLine());
        String rev = pal.reverse().toString();


        if (pal.equals(rev)){
            System.out.println("yes "+rev+" is palindrome");

        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
