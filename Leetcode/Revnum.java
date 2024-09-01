package Leetcode;

import java.util.Scanner;

class Revnum{
        public int reverse(int x)
        {
            int result = 0;

            while (x != 0)
            {
                int tail = x % 10;
                int newResult = result * 10 + tail;
                if ((newResult - tail) / 10 != result)
                { return 0; }
                result = newResult;
                x = x / 10;
            }

            return result;
        }

        public static void main(String[] args) {
            Revnum sol = new Revnum();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter x");
            int x  = scan.nextInt();
            System.out.println(sol.reverse( x));
        }
    }

