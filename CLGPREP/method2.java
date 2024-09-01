package CLGPREP;

public class method2 {
    public static int sub(int a, int b) {
        return a - b;
    }

    private static int div(int a, int b) {
        return a / b;
    }

    protected static int mull(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println(div(a, b));
        System.out.println(mull(a, b));
    }
}
