package Factory;

/**
 * Created by Peti on 2017.07.18..
 */
public class Tomato extends PizzaComponent {
    public Tomato(){
        super(PizzaComponentType.SAUCE);
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing tomato...Hmm");
    }
}
