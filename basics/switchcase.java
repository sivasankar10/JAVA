package basics;

import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String url ;
        System.out.println("Enter the url :");
        url = scan.nextLine();
        int i = url.lastIndexOf(".");
        int j = url.indexOf(":");
        String type = url.substring(i+1);
        String protocol =url.substring(0,j);
        switch (protocol){
            case "https":
                System.out.println("Hypertext protocol");
                break;
            case "ftp":
                System.out.println("file transfer protocol");
                break;
        }
        switch (type){
            case ".com":
                System.out.println("commercial");
                break;
            case ".org":
                System.out.println("organization");
                break;
        }










//        int month ;
//        System.out.println("Enter the number :");
//        month = scan.nextInt();

//        switch (month)
//        {
//            case 1: System.out.println("JAN");
//                break;
//            case 2:
//                System.out.println("FEB");
//                break;
//            case 3:
//                System.out.println("MAR");
//                break;
//            case 4:
//                System.out.println("APR");
//                break;
//            case 5:
//                System.out.println("MAY");
//                break;
//            case 6:
//                System.out.println("JUN");
//                break;
//            case 7:
//                System.out.println("JUL");
//                break;
//            case 8:
//                System.out.println("AUG");
//                break;
//            case 9:
//                System.out.println("SEP");
//                break;
//            case 10:
//                System.out.println("OCT");
//                break;
//            case 11:
//                System.out.println("NOV");
//                break;
//            case 12:
//                System.out.println("DEC");
//                break;
//            default:
//                System.out.println("INVALID ENTRY");
//
//
//        }
    }
}
