package Aspect_Oriented_Programming.PointCut_with_Parameters_with_Security_Checks;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary {

    public void getBook() {
        System.out.println("Get book from " + getClass().getSimpleName());
    }

    public void getMagazine() {
        System.out.println("Get magazine from " + getClass().getSimpleName());
    }
}
