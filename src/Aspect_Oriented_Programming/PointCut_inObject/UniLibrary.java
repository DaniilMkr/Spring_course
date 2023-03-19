package Aspect_Oriented_Programming.PointCut_inObject;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary {

    public void getBook(Book book) {
        System.out.println("Get book from " + getClass().getSimpleName() + "" + book.getName());
    }


}
