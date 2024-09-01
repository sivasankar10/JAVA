package CLGPREP;

import java.util.Scanner;

public class Heat {
    double  fahrenheittocelcius(double f) {

        double c = ((f - 32)*5/9);
        return c;

    }

    double  celciustofahrenheit(double c) {
        double f = ((9/5)*c+32);
        return f;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the option needed \n1.Fahrenheit to celcius \n2.celcius to fahrenheit\n");
        int n = scan.nextInt();
        Heat heat = new Heat();
        if (n == 1) {
            System.out.println("Enter fahrenheit value ");
            double f = scan.nextInt();
            System.out.println(heat.fahrenheittocelcius(f)+"C");
        } else if (n == 2) {
            System.out.println("Enter celcius value ");
            double c = scan.nextInt();
            System.out.println(heat.celciustofahrenheit(c)+"F");

        }
    }
}
