package Muon_Sach;

public class Main {
    public static void main(String[] args) {
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();
        bookBorrower1.borrowBook();
        System.out.println("borrow1 want to a book");
        System.out.println("borrow1 author and title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());
        bookBorrower2.borrowBook();
        System.out.println("borrow2 want to a book");
        System.out.println("borrow2 author and title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());
        bookBorrower1.returnBook();
        System.out.println("borrow1 returned book");
        bookBorrower2.borrowBook();
        System.out.println("borrow2 author and title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

    }
}
