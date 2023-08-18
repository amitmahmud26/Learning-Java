import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalWithFile {
        static ArrayList<Book> allBooks = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        File file = new File("Book.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            allBooks.add(new Book(scanner.next(), scanner.next(), scanner.next(), scanner.next()));
        }


        if(allBooks.isEmpty()){
            System.out.println("No data!");
        }
        System.out.println("List size: "+allBooks.size());
        new GUIApp();

    }
    public String checkSearchBookName(String bookName){
        for (Book book: allBooks) {
            if(book.Book_name.equals(bookName)){
                String bookDetails = "Name: "+book.Book_name+"\nAuthor: "+book.Author+"\n";
                return bookDetails;
            }
        }

        return "No books found!";
    }
}
class Book{
    String Book_name, Book_id, Author, Publishing_date;

    public Book(String book_name, String book_id, String author, String publishing_date) {
        Book_name = book_name;
        Book_id = book_id;
        Author = author;
        Publishing_date = publishing_date;
    }
}
