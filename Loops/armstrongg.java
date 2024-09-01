import java.util.*;

public class armstrongg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = scan.nextInt();

        int total =0 ;
        int temp = n;
        while (n>0)
        {
            int r = n % 10;
            n = n / 10;
            total = total + r * r * r;
        }
        if (temp == total)
        {
            System.out.println("armstrong");
        }
        else {
            System.out.println("no no no ");
        }


    }
}