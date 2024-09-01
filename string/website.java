package string;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str ;
        System.out.println("Enter your string.website :");
        str = scan.nextLine();
        int i = str.lastIndexOf(".");
        int j = str.indexOf(":");
        String type = str.substring(i);
        String protocol = str.substring(0,j);

        if(type.equals(".com"))
        {
            System.out.println(type+"  is a commercial string.website");

        }
        else if(type.equals(".org"))
        {
            System.out.println(type+"  is an organization string.website ");
        }
        else if(type.equals(".in")){
            System.out.println(type+"  is indian string.website ");
        }

        if(protocol.equals("https"))
        {
            System.out.println(protocol+" is hypertext transfer protocol");

        }
        else if(protocol.equals("ftp"))
        {
            System.out.println(protocol+" is file transfer protocols ");
        }

    }
}
