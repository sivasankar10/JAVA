package CLGPREP;

// Java program to find Majority
// element in an array

import java.io.*;

class arrmajorityele {

    // Function to find Majority element
    // in an array
    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }


        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

    // Driver code
    public static void main(String[] args)
    {

        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;

        // Function calling
        findMajority(arr, n);
    }
    // This code is contributed by ajit.
}

