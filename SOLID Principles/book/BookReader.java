
import java.util.List;

public class BookReader extends Book implements InterfaceReader {
    
    public BookReader(String title, List<String> pages) {
        super(title,pages);
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
