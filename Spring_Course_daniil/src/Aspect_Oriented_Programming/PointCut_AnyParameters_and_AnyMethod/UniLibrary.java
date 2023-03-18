package Aspect_Oriented_Programming.PointCut_with_AnyParameters;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary {

    public void getBook(String bookName) {
        System.out.println("Get book from " + getClass().getSimpleName() + bookName);
    }

    public void getMagazine(int a) {
        System.out.println("Get book from " + getClass().getSimpleName() + a);
    }


}
