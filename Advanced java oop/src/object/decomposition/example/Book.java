package object.decomposition.example;

import java.util.ArrayList;

public class Book {

    // state
    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<Review>();


    Book(int id,String name,String author){
        this.id = id;
        this.name = name;
        this.author = author;

    }

    public void addReview(Review review){
        this.reviews.add(review);

    }

    public String toString(){
        return String.format("Id : %d\n Name : %s\n Author : %s\n Review : %s",id,name,author,reviews);
    }

}
