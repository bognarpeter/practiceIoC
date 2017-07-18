package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */
public class Gossip {
    private String type;
    private String author;
    private String body;

    public Gossip(String type, String author, String body){
        this.type = type;
        this.author = author;
        this.body = body;
    }
    public String getType(){return this.type;}
    public String getAuthor(){return this.author;}
    public String getBody(){return this.body;}

}
