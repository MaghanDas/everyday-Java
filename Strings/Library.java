import java.util.*;

class Book {
    static ArrayList<String> bookList = new ArrayList<String>();
    Scanner in = new Scanner(System.in);

    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No Books to Show");
            System.out.println("PLEASE ADD SOME BOOKS");
            System.out.println("------------------------------");
        } else {
            for (String bookName : bookList) {
                System.out.println(bookName);
                System.out.println("------------------------------");
            }
        }
        System.out.println("Please enter any key to return menu");
        String input = in.next();
        System.out.println("------------------------------");
    }

    public void searchBook(String bookName) {
        if (bookList.contains(bookName)) {
            System.out.println("Book is available!");
            System.out.println("------------------------------");
        } else {
            System.out.println("This book is currently not vailable");
        }
        System.out.println("Please enter any key to return menu");
        String input = in.next();
        System.out.println("------------------------------");
    }

    public void purchaseBook(String bookName) {
        if (bookList.contains(bookName)) {
            System.out.println("Books purchased successfully!");
            System.out.println("------------------------------");
        } else {
            System.out.println("this book is currently not vailable");
        }
        System.out.println("Please enter any key to return menu");
        String input = in.next();
        System.out.println("------------------------------");
    }

    public void addBook(String bookadd) {
        bookList.add(bookadd);
        System.out.println("Your book is added successfully");
        System.out.println("------------------------------");
        System.out.println("Please enter any key to return menu");
        String input = in.next();
        System.out.println("------------------------------");
    }
}

public class Library {
    public static void main(String[] args) {

        Book b1 = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\t***********************************");
        System.out.println("\t\t\t\tWELCOME TO MY LIBRARY");
        System.out.println("\t\t\t***********************************");
        do {
            System.out.println("ENTER YOUR CHOICE...");
            System.out.println("------------------------------");
            System.out.println("1-To Display available Books");
            System.out.println("2-To Search for Book");
            System.out.println("3.To Purchase the book");
            System.out.println("4.To Add your book in Libray");
            System.out.println("5.To Quit from library");
            System.out.println("------------------------------");

            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------");
                    b1.displayBooks();
                    break;
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("enter the name of book to search for:");
                    String bookName = sc.next();
                    b1.searchBook(bookName);
                    break;
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("enter the name of book to purchase:");
                    String bookpur = sc.next();
                    b1.purchaseBook(bookpur);
                    break;
                case 4:
                    System.out.println("------------------------------");
                    System.out.println("enter the name of book u want to add in our library");
                    String bookadd = sc.next();
                    b1.addBook(bookadd);
                    break;
                case 5:
                    System.out.println("------------------------------");
                    System.out.println("THANKS FOR VISITING");
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("------------------------------");
                    System.out.println("Please press valid key:");
                    System.out.println("------------------------------");
                    break;
            }
        } while (true);
    }
}