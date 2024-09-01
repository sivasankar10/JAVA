package Loops;
import java.sql.SQLOutput;
import java.util.*;
public class sumofn {
    public static int sumofnum(int n)
    {
        int sum =0;
        for (int i = 1; i<= n;i++)
        {
            sum =sum +i;
        }
        return sum;

    }

    public static void main(String args[]){
        int n = 25;
        System.out.println("The Sum of "+n+" Is "+sumofnum(n));

    }
}
