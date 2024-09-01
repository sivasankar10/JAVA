package CLGPREP;
import java.util.*;
public class arr {
    public static void main(String args[])
    {
        int[] a= new int[5];
        int i ;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the numbers ");
        for ( i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }
        int max =a[0];
        for (i=0;i<a.length;i++)
        {
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("The maximum Number in the given list is : "+max);

    }
}
