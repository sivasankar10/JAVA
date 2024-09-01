package CLGPREP;
import java.sql.SQLOutput;
import java.util.*;
public class Area {

    int rectangle(int length, int width) {
        return length * width;
    }

    int square(int a) {
        return a*a;
    }

    double triangle(int base,int height,double half) {
        return (half*height*base);
    }
    public static void main(String args[]) {
        int length =0;
        int breadth =0;
        int a =0;
        int width =0;
        int base=0,height=0;
        double half=0.5;
        Scanner scan = new Scanner(System.in);
        Area area = new Area();
        System.out.println("Select any one :\n1.Rectangle\n2.Square\n3.triangle\n");
        int n = scan.nextInt();

        if (n == 1) {
            System.out.println("Enter Length and breadth ");
            length = scan.nextInt();
            breadth = scan.nextInt();
            System.out.println("Area of Reactangle: "+area.rectangle(length,breadth));
        } else if (n == 2) {
            System.out.println("Enter the area :");
            a = scan.nextInt();
            System.out.println("Area is :"+area.square(a));
        } else if (n == 3) {
            System.out.println("Enter Height and base: ");
            height = scan.nextInt();
            base =scan.nextInt();
            System.out.println("Area of the Triangle is :"+area.triangle(height,base,half));

        }
    }
}


