package basics;

import java.util.Scanner;

public class area {
    public static void main(String args[]){
//        float base,height,basics.area;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Base and Height : ");
//        base = sc.nextFloat();
//        height =sc.nextFloat();
//
//        basics.area = base * height/2 ;
//        System.out.println("Area of the triangle is = "+basics.area);

        float a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of : a");
        a = sc.nextFloat();
        System.out.println("Enter the value of : b");
        b = sc.nextFloat();
        System.out.println("Enter the value of : c");
        c = sc.nextFloat();

        float s = (a + b + c)/2f;
        float area = s*((s-a)*(s-b)*(s-c));

        System.out.println("Area of Triangle is : "+Math.sqrt(area));

    }
}
