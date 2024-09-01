package string;

import java.util.*;

public class gmail {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String email ;
        System.out.println("Enter the email id :");
        email = scan.nextLine();

        int i = email.indexOf("@");
        String username = email.substring(0,i);
        String Domain = email.substring(i+1);
        int j = Domain.indexOf(".");
        String gmail = Domain.substring(0,j);


        System.out.println("Userame:"+username);
        System.out.println("Domain:"+Domain);


        //it can be checked like this or using "string.gmail.startsWith("string.gmail"); this method
        System.out.println(gmail.equals("string.gmail"));


//        System.out.println(email.matches("[//w+@string.gmail.com]"));




    }
}
