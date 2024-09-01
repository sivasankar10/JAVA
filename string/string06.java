package string;

public class string06 {

    public static void main(String[] args) {

        String str1 = "Siva";
        String str2 ="banno";
        System.out.println(str2);

        char c[] = {'v','a','n','i'};
        String str3 = new String(c,1,3);
        System.out.println(str3);

        byte b[] = {72,67,69,80,90};
// String methods
        String str4 = new String(b,0,3);
        System.out.println(str4);
        String str5 = str1.toUpperCase();
        System.out.println(str5);
        str1 = str1.toLowerCase();
        System.out.println(str1);

        str2 = str2.replace("banno","Banno");
        System.out.println(str2);
    }
}
