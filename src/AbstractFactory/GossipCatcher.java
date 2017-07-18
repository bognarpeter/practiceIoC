package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */

public class GossipCatcher {
    public void spreadDaGossip(PostCreator pc, Gossip g){
        Post post = pc.createPost(g.getAuthor(), g.getBody());
    }

}
