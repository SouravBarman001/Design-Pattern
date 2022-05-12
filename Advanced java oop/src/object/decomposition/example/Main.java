package object.decomposition.example;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(123,"OOP","XYZ");
        book.addReview(new Review(10,"Great Book",5));
        book.addReview(new Review(101,"nice Book",4));
        System.out.println(book);
    }
}
