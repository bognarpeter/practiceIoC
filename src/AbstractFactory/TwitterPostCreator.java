package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */
public class TwitterPostCreator implements PostCreator {
    @Override
    public Post createPost(String author,String body) {
        Post post = new TwitterPost(author, body);
        return post;
    }
}
