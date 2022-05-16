package memento.design.pattern.editor.example;

public class Originator {
    private String Article;

    public void setArticle(String article){
        this.Article = article;
    }

    public String getArticle(){
        return Article;
    }

    public Memento save(){
        return new Memento(Article);
    }

    public void restore(Memento o){
        this.Article = o.getState();
    }







}
