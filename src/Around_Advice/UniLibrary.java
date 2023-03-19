package Around_Advice;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("Get book from " + getClass().getSimpleName());
        System.out.println("-------------------------------------------");
    }
    public String returnBook() {
        System.out.println("Return book to UniLibrary");
        return "War and Peace";
    }
}
