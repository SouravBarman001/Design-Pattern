package object.decomposition.example;

public class Book {

    // state
    private int id;
    private String name;
    private String author;
    private Review review;


    Book(int id,String name,String author, Review review){
        this.id = id;
        this.name = name;
        this.author = author;
        this.review = review;

    }

    public String toString(){
        return String.format("Id : %d\n Name : %s\n Author : %s\n Review : %s",id,name,author,review);
    }



}
