package Aspect_Oriented_Programming.PointCut;

import org.springframework.stereotype.Component;

@Component()
public class Library extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Get the book");
    }
}
