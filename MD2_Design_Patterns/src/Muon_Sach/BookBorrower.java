package Muon_Sach;

public class BookBorrower {
    private static BookSingleton borrowedBook;
    private static boolean haveBook = false;
    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();
        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }

    public static String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "not book";
    }

    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }

}
