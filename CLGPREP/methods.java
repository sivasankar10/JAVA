package CLGPREP;

//import static CLGPREP.method2.sub;

public class methods {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int d) {
        return a + b + d;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 12;
        int c = method2.sub(a, b);
        int d = 25;
        System.out.println("Addition of " + a + " and " + b + " is :" + add(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is :" + add(a, b));
        System.out.println("Sucbraction of " + a + " and " + b + " is :" + c);
        System.out.println("Addition of " + a + " + " + b + " + " + d + " is :" + add(a, b, d));

    }

}
