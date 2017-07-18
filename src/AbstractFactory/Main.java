package AbstractFactory;

/**
 * Created by Peti on 2017.07.18..
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
