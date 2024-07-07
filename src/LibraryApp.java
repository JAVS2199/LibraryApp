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
}
