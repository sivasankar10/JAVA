package basics;

import java.util.*;

public class forsum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =0;

        for (int i =1; i<=10; i++)
        {
            sum +=i;
            System.out.println(sum);
        }
    }
}
