package Factory;

import static Factory.PizzaComponentType.DOUGH;
import static Factory.PizzaComponentType.SAUCE;
import static Factory.PizzaComponentType.TOPPING;

/**
 * Created by Peti on 2017.07.18..
 */

/*
* Example for Factory Pattern based on: Creating
* components for a delicious pizza.
*/
public class Main {
    public static void main(String[] Args){
        PizzaComponentFactory.prepareComponent(DOUGH);
        PizzaComponentFactory.prepareComponent(SAUCE);
        PizzaComponentFactory.prepareComponent(TOPPING);
    }
}
