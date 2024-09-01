package basics;

import java.util.*;
public class space {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter string with spaces : ");
        str =in.nextLine();
        System.out.println(str.replaceAll("\\s+",""));
    }
}
