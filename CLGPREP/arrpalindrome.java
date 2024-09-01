package CLGPREP;

import java.util.*;

public class arrpalindrome {

    public static boolean isPalindrome(int[] arr, int n ) {
        int flag = 0;
           for (int i = 0; i < n/2;i++) {
               if(arr[i] != arr[n - i - 1]) {
                    flag =1;
                   break;
               }
           }
           if (flag == 0) {
               return true;
           } else {
               return false;
           }
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,2,1};
        int n = arr.length;
        arr =new int[n];

        System.out.println(isPalindrome(arr,n));
    }
}
