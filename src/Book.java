public class Book {
    private String isbn;
    private String title;
    private String description;
    private String author;
    private String genre;
    private int quantity;
    private int numCheckedOut;

    public Book(String title, String isbn, String description, String author, String genre, int quantity, int numCheckedOut) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
        this.numCheckedOut = numCheckedOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean checkOut(){
        if(numCheckedOut>= quantity){
            return false;
        }
        numCheckedOut++;
        return true;
    }
    public Boolean checkIn(){
        if(numCheckedOut <= 0){
            return false;
        }
        numCheckedOut--;
        return true;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNumCheckedOut() {
        return numCheckedOut;
    }

    public void setNumCheckedOut(int numCheckedOut) {
        this.numCheckedOut = numCheckedOut;
    }
}
