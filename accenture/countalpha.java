package accenture;
import java.util.*;
public class countalpha {
     public static void main(String[] args) {
          String str = "The quick brown fox jumps over the lazy dog";
          String s = "";
          int count = 0;
          String str1 = str.toLowerCase();

          for (int i =0; i <str1.length();i++)
          {
               if (str1.charAt(i) >= 'a'&& str1.charAt(i) <= 'z') {
                   if (s.contains(String.valueOf(str1.charAt(i)))){
                       continue;
                   }
                   else {
                        s = s + str1.charAt(i);
                        count++;
                   }
               }
          }
          if (count == 26) {
               System.out.println("YES");
          }
          else {
               System.out.println("NO");
          }

     }


}
