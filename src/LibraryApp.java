import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        System.out.println("Searching for books with ISBN: "+isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){
            System.out.println("1 book found: \n\tTile: "+book.getTitle());
        }else{
            System.out.println("Book not found!");
        }
    }

    public void searchByTitle(String keyword){
        System.out.println("Searching for books by tile using the following keyword: "+keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.println("Books found: "+books.size());
        for(Book book : books){
            System.out.println("1 book found: \n\tTile: "+book.getTitle());
        }
    }
    public void checkOutBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){
            book.checkOut();
            System.out.println("Book checked out successfully");
        }else{
            System.out.println("Failed to check out book");
            System.out.printf("Reason: there is no book with ISBN %s on record.\n ",isbn);
        }
    }

    public void checkInBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){
            book.checkIn();
            System.out.println("Book checked in successfully");
        }else{
            System.out.println("Failed to check in book");
            System.out.printf("Reason: there is no book with ISBN %s on record.\n ",isbn);
        }
    }
}
