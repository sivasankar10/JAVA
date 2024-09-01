package CLGPREP;
import java.util.*;

public class arrrotatek {
    public static int[] rotatek(int n, int[] arr, int k) {

        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
        return temp;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("No of elemnts: ");
        int n = scan.nextInt();
        System.out.println("Enter elements:");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter no of rotates:");
        int k = scan.nextInt();
        rotatek(n,arr,k);

    }
}
