package CLGPREP;
import java.util.*;
public class sumarr {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] a ;
        int b ,i ,sum = 0;
        System.out.println("Enter the length of array :");
        b = scan.nextInt();
        a = new int[b];
        System.out.println("Enter the elements");
        for (i =0; i < b;i++)
        {
            a[i] = scan.nextInt();
        }
        for (i =0;i < a.length; i++ )
        {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
