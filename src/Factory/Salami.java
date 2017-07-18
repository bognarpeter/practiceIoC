package Factory;

/**
 * Created by Peti on 2017.07.18..
 */
public class Salami extends PizzaComponent {
    public Salami(){
        super(PizzaComponentType.TOPPING);
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing salami...yummi");
    }
}
