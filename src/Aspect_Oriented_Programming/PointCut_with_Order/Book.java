package Aspect_Oriented_Programming.PointCut_with_Order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value(" War and Peace ")
    private String name;

    public String getName() {
        return name;
    }
}
