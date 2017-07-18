package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */
public class FacebookPostCreator implements PostCreator {
    @Override
    public Post createPost(String author,String body) {
        Post post = new FacebookPost(author, body);
        return post;
    }
}
