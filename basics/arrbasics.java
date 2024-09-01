package basics;

import java.util.Scanner;

public class arrbasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; arr[i]= scan.nextInt(),i++);

        for (int j = 0; j < n; System.out.print(arr[j]+" "),j++);

        //max element in the array
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("\nMax element is:"+max);
    }
}
