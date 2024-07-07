import java.util.ArrayList;

public class BookRepository {

    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository(){
        Book book1 = new Book("83471","The dead of night", null, "S.K.", "Horror");
        books.add(book1);
    }

}
