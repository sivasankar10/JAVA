package string;
import java.util.*;
public class wordlen {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("Enter the string :");
        str = scan.nextLine();
        String str1 = str.replaceAll("\\s+"," ").trim();
        String str2[] =str1.split("\\s");
        System.out.println(str2.length);


    }
}
