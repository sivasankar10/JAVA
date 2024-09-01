package CLGPREP;

import java.util.Scanner;

public class Anagram {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I1: ");
        String n1 = scan.nextLine();
        System.out.println("I2: ");
        String n2 = scan.nextLine();
        int count = 0;

        int len1 = n1.length();
        int len2 = n2.length();

        if (len1 != len2) {
            System.out.println("NOT AN ANAGRAM");
        } else {
            for (int i = 0; i < n1.length(); i++) {
                for (int j = 0; j < n2.length(); j++) {
                    if (n1.charAt(i) == n2.charAt(j)) {
                        count++;
                        break; // Once a match is found, move to the next character
                    }
                }
            }
            if (count == len1) {
                System.out.println("ANAGRAM");
            } else {
                System.out.println("NOT AN ANAGRAM");
            }
        }
    }
}
