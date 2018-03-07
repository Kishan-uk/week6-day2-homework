import static org.junit.Assert.*;
import org.junit.*;

public class BookGenreTest {

    BookGenre genre;

    @Before
    public void before() {
        genre = new BookGenre(GenreType.ROMANCE);
    }


    @Test
    public void canGetValue() {
        assertEquals(GenreType.COOKERY, genre.getValue());
    }

    @Test
    public void politicalHasValue() {
        genre = new BookGenre(GenreType.POLITICAL);
        assertEquals("Ideas or strategies of a particular party or group in politics.", genre.getValueFromEnum());
    }

    @Test
    public void canGetAllGenres() {
        GenreType[] expected = {GenreType.BIOGRAPHY, GenreType.POLITICAL, GenreType.ROMANCE, GenreType.COOKERY};
        GenreType[] genre = GenreType.values();
        assertEquals(4, genre.length);
        assertArrayEquals(expected, genre);
    }
}