import java.util.*;

public class splchar {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str;
        System.out.println("Enter a string ");
        str = scan.nextLine();
        String str1 =str.replaceAll("[\\W]","");
        str1.replaceAll("[\\s]"," ");
        System.out.println(str1.replaceAll("[\\s+]"," "));
    }
}
