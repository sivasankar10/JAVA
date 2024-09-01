package CLGPREP;

import java.util.*;

public class arrrev {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] a;
        int b, i, rev = 0;
        System.out.print("Enter the length of the array :");
        b = scan.nextInt();
        a = new int[b];
        System.out.println("Enter elements: ");
        for (i = 0; i < b; i++) {
            a[i] = scan.nextInt();
        }
        int start = 0;
        int temp = 0;
        int end = b - 1;

        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
