package basics;

import java.lang.*;
import java.util.Scanner;


public class cuboidarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float len =0 ,br=0,ht=0;
        System.out.println("Enter Length , Width and Breadth : ");
        len = sc.nextFloat();
        br = sc.nextFloat();
        ht = sc.nextFloat();

        float volume = len * br * ht;
        float ToatalArea = (2*(len*ht+br*ht+len*ht));

        System.out.println("Total Area is : "+ToatalArea);
        System.out.println("Volume : "+volume);
    }
}





