import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BorrowerTest {

    Book book;
    Borrower person;

    @Before
    public void before() {
        person = new Borrower("James Bond");
        book = new Book();
    }

    @Test
    public void canAddBookToCollection(){
        person.addBookToCollection(book);
        assertEquals(1, person.collectionCount());
    }

    @Test
    public void canRemoveBookFromCollection(){
        person.addBookToCollection(book);
        Book removed = person.removeBookFromCollection();
        assertNotNull(removed);
        assertEquals(0, person.collectionCount());
    }

}