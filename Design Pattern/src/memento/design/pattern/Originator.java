package memento.design.pattern;

public class Originator {
    private String article; // holding current state of the memento

    public Originator(){

    }
    public void setArticle(String article){
        this.article = article;
    }

    public String getArticle(){
        return this.article;
    }

    public Memento save(){
        return new Memento(article);
    }

    public void restore(Memento m){
        this.article = m.getState();
    }
}
