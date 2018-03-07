import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book();
    }

    @Test
    public void bookCountIsZero(){
        assertEquals(0, library.bookCount());
    }


    @Test
    public void addBookToStock(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }


    @Test
    public void checkCapacity(){
        for (int i = 0; i <12; i++){
            library.addBook(book);
        }
        assertEquals(10, library.bookCount());
    }
}
