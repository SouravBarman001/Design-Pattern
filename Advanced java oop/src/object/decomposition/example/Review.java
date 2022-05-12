package object.decomposition.example;

public class Review {
    // state
    private int id;
    private String description;
    private int rating;

    Review(int id,String description,int rating){
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString(){
        return id+" "+description+" "+rating;
    }
}
