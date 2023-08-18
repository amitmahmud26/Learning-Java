import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("Book.txt");
        FileReader fw = new FileReader(file);
        fw.close();
    }
}
class Book{
    String book_name, book_id, author, publishing_year;

    public Book(String book_name, String book_id, String author, String publishing_year) {
        this.book_name = book_name;
        this.book_id = book_id;
        this.author = author;
        this.publishing_year = publishing_year;
    }
}