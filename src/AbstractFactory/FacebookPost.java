package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */
public class FacebookPost extends Post {
    public FacebookPost(String author, String body){
        super(author, body);
        publish();
    }
    @Override
    public void publish() {
        System.out.println(getAuthor() + " posted on Facebook: " + getBody());
    }
}
