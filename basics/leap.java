package basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year;
        System.out.println("Enter year :");
        year = scan.nextInt();
        if(year % 4 ==0)
        {
            if(year % 100 ==0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("its a leap year ");
                }
                else {
                    System.out.println("not a leap year");
                }
                } else {
                System.out.println(" yes it is a leap year ");
            }
            }else {
            System.out.println("not a leap year");
        }


        }


    }

