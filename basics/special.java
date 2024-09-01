package basics;

import java.util.*;

public class special {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string ");
        str = in.nextLine();
        System.out.println(str.replaceAll("\\W",""));

    }
}
