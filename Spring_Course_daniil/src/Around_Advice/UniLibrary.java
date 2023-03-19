package Aspect_Oriented_Programming.JoinPoint;

import org.springframework.stereotype.Component;

import javax.xml.transform.Source;

@Component()
public class UniLibrary {

    public void getBook() {
        System.out.println("Get book from " + getClass().getSimpleName());
        System.out.println("-------------------------------------------");
    }
    public void getMagazine()  {
        System.out.println("Get magazine from " + getClass().getSimpleName());
        System.out.println("-------------------------------------------");
    }
    public void addBook(String person_name, Book book) {
        System.out.println("Add book to " + getClass().getSimpleName());
        System.out.println("-------------------------------------------");
    }
    public void addMagazine() {
        System.out.println("Add magazine to " + getClass().getSimpleName());
        System.out.println("-----------------------------------------");
    }
    public void returnBook() {
        System.out.println("Return book to " + getClass().getSimpleName());
        System.out.println("-----------------------------------------");
    }
    public void returnMagazine() {
        System.out.println("Return magazine to " + getClass().getSimpleName());
        System.out.println("-----------------------------------------");
    }
}
