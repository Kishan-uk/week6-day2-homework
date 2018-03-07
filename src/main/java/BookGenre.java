public class BookGenre {
    private GenreType value;

    public BookGenre(GenreType value) {
        this.value = value;
    }

    public GenreType getValue() {
        return value;
    }

    public String getValueFromEnum() {
        return this.value.getValue();
    }
}
