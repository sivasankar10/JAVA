package CLGPREP;

public class revwords {
    public static void main(String args[]) {
        String S = "Siva Sankar ";
        String rev = " ";
        for (String a : S.split(" ")){
            for(int i =a.length()-1;i >=0;i--){
                rev += a.charAt(i);

            }
            rev = rev + " ";
        }
        System.out.println(rev);
    }
}