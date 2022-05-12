package object.decomposition.example;

public class Main {
    public static void main(String[] args) {

        Review review = new Review(10,"Great Book",5);
        Book book = new Book(123,"OOP","XYZ",review);

        System.out.println(book);
    }
}
