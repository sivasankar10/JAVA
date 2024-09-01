package Loops;

import java.util.*;
public class AP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, d, n;
        System.out.println("Enter starting and difference variable :");
        a =scan.nextInt();
        d = scan.nextInt();
        System.out.println("Enter no of variables needed ;");
        n=scan.nextInt();
        int temp = a;
        for (int i =0; i<=n; i++){
            System.out.print(temp +" ");
              temp = temp +d;

        }
    }
}
