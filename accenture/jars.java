package accenture;

import java.util.*;
public class jars {
    int chocApicked(int []jarss, int N)  {
        int chocApicked = 0;
        for (int choc : jarss) {
            int round = choc / 3;
            int remainder = choc % 3;
            chocApicked = chocApicked + round;

            if (remainder > 0) {
                chocApicked += 1;
            }

        }
        return chocApicked;
    }
    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter NUMBER OF JARS :");
        int N = scan.nextInt();
        int[] jarss =new int[20];
        System.out.println("Enter the choclates in each jar: ");
        for (int i = 1; i <= N; i++) {
              jarss[i]=scan.nextInt();
        }
        jars jar = new jars();
        System.out.print("Total chocalates picked by A :"+jar.chocApicked(jarss,N));
    }

}
