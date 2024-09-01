package basics;

import java.sql.SQLOutput;

public class printformat {

    public static void main(String[] args) {
        int x = 10;
        char a = 'B';
        float f = 69f;
        int r = 79;


        System.out.printf("Addition of %d and %f is %d",x,f,r);
        System.out.printf("%015.2f",f);
    }
}
