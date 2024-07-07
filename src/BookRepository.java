import java.util.ArrayList;

public class BookRepository {

    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository(){
        Book book1 = new Book("83471","The dead of night", null, "S.K.", "Horror");
        books.add(book1);
    }

    public Book findByIsbn(String isbn){
        //Using a foreach loop
        for (Book book: books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> bookSimilarKeyword = new ArrayList<>();
        for(Book book: books){
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                bookSimilarKeyword.add(book);
            }
        }
        return bookSimilarKeyword;
    }

}
