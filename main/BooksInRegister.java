import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BooksInRegister {

    ArrayList<Book> books = new ArrayList<>();

    public BooksInRegister() throws FileNotFoundException {
        readFile(new File("C:\\Users\\vivir\\IdeaProjects\\BigTaskBookRegister\\main\\bok.txt"));
        for (Book b : books) {
            printBook(b);
        }
    }

    private void printBook(Book b) {
        System.out.println(b.getISBN());
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getNumberPages());
        System.out.println(b.getGenre());
        System.out.println("----------------");
    }

    private void readFile(File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        addBooks(reader);
        reader.close();
    }

    private void addBooks(Scanner reader) {
        while (reader.hasNextLine()) {
            long isbn = Long.parseLong(reader.nextLine());
            String title = reader.nextLine();
            String name = reader.nextLine();
            int numberOfPages = Integer.parseInt(reader.nextLine());
            Genre genre = Genre.valueOf(reader.nextLine());
            reader.nextLine();
            books.add(new Book(isbn, title, name, numberOfPages, genre));
        }
    }

}