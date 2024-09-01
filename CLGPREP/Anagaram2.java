package CLGPREP;

import java.util.Arrays;
import java.util.Scanner;

public class Anagaram2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s1 =scan.nextLine();
        String s2 =scan.nextLine();

        char s3[]= s1.toCharArray();
        char s4[]=s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);

        if(Arrays.equals(s3,s4)) {
            System.out.println("ANAGRAM");
        }
        else {
            System.out.println("NOT AN ANAGRAM");
        }
    }
}
