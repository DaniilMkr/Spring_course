package Aspect_Oriented_Programming.PointCut;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Get book from " + getClass().getSimpleName() +"\n");
    }

    @Override
    public void addBook() {
        System.out.println("Add book to " + getClass().getSimpleName() + "\n");
    }

    @Override
    public void returnBook() {
        System.out.println("Return book to " + getClass().getSimpleName());
    }
}
