import java.util.HashMap;

public class NumberOfBooks {
    public static void main(String[] args) {
        HashMap<String, Integer> books = new HashMap<String, Integer>();

        books.put("Biography", 150);
        books.put("Political", 75);
        books.put("Romance", 100);
        books.put("Cookery", 40);

        System.out.println(books.get("Romance"));
        System.out.println(books.size());
        System.out.println(books.values());
        System.out.println(books.keySet());
    }
}