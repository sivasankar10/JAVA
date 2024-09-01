package accenture;

public class stringcapsmall {
    public static void main(String args[]) {
        String str1 = "ABhkASSSjdjvi";
        int i;
        int cap = 0;
        int small = 0;

        for (i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {
                cap++;
            } else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                small++;
            }
        }
        if (cap > small) {
            System.out.println(str1.toUpperCase());
            System.out.println("cap letter count : " + cap);
        } else if (small > cap) {
            System.out.println(str1.toLowerCase());
            System.out.println("Small letter count : " + small);
        }
    }
}
