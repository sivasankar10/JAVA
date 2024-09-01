package CLGPREP;

import java.util.Scanner;

class Book2 {
    String Title;
    String Author;
    String Price;
    String Rating;
    String reviews;

    void enterdetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Title , Author ,Price,Rating :");
        Title = scan.nextLine();
        Author = scan.nextLine();
        Price = scan.nextLine();
        Rating = scan.nextLine();
        System.out.println("Enter review ;");
        reviews = scan.nextLine();
        bookdetails(Title, Author, Price, Rating);
        bookreview(reviews);
    }

    void bookdetails(String Title, String Author, String Price, String Rating) {
        System.out.println("Title :" + Title);
        System.out.println("Author:" + Author);
        System.out.println("Price :" + Price);
        System.out.println("Rating :" + Rating);
    }

    void bookreview(String reviews) {
        System.out.println("Review :" + reviews);
    }
}

public class BBOOK {
    public static void main(String[] args) {
        Book2 get = new Book2();
        get.enterdetails();

    }
}
