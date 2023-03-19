package Aspect_Oriented_Programming.JoinPoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value(" War and Peace ")
    private String name;
    @Value(" Leo Tolstoy ")
    private String author;
    @Value("1869")
    private int yearOfPublication;


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
