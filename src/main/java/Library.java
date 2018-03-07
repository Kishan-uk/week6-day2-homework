import java.util.ArrayList;

public class Library {

    private ArrayList<Book> shelves;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.shelves = new ArrayList<>();
    }

    public int bookCount() {
        return shelves.size();
    }

    public void addBook(Book book) {
        if(bookCount() < this.capacity) {
            this.shelves.add(book);
        }
    }

}
