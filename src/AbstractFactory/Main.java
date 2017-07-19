package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
 */
/*
* Example for Abstract Factory Pattern.
* The content will be published on Facebook or Twitter
* depending on the type of the topic
*/
public class Main {
    public static void handleGossip(GossipCatcher gc, Gossip g){
        PostCreator pc = null;
        if("HOT".equals(g.getType())){
            pc = new TwitterPostCreator();
        }else{
            pc = new FacebookPostCreator();
        }
        gc.spreadDaGossip(pc,g);
    }

    public static void main(String[] Args){
        Gossip g1 = new Gossip("HOT","Ramositho","Someone stole my chickens! #MadnSad");
        Gossip g2 = new Gossip("BORING","Chucezitho","I won't go to KFC 2NITE #Chicks");
        GossipCatcher gc = new GossipCatcher();
        handleGossip(gc,g1);
        handleGossip(gc,g2);

    }
}
