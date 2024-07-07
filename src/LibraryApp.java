public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){
            System.out.println("1 book found: \n\tTile: ");
        }else{
            System.out.println("Book not found!");
        }
    }
}
