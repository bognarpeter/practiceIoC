package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */
public class TwitterPost extends Post {
    public TwitterPost(String author, String body){
        super(author, body);
        publish();
    }
    @Override
    public void publish() {
        System.out.println(getAuthor() + " posted on Twitter: " + getBody());
    }
}
