package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */
public abstract class Post {
    private String author;
    private String body;

    public Post(String author,String body){
        this.author = author;
        this.body = body;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String a){this.author=a;}

    public String getBody(){
        return this.body;
    }
    public void setBody(String b){this.body=b;}

    public abstract void publish();
}
