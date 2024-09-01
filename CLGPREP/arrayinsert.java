package CLGPREP;

public class arrayinsert {
    public static void main(String args[]) {
        int a[] = { 1, 4, 8, 4, 9, 5, 5 };
        int b[] = new int[a.length + 1];
        int mid = a.length / 2;
        int insert = 6;
        int i;
        for (i = 0; i < b.length; i++) {
            if (i < mid) {
                b[i] = a[i];
            } else if (i == mid) {
                b[i] = insert;
            } else {

                b[i] = a[i - 1];
            }
        }
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
