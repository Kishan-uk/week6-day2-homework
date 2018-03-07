import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public void addBookToCollection(Book book){
        this.collection.add(book);
    }

    public Book removeBookFromCollection(){
        return this.collection.remove(0);
    }
}