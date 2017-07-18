package Factory;

/**
 * Created by Peti on 2017.07.18..
 */
public class PizzaComponentFactory {
    public static PizzaComponent prepareComponent(PizzaComponentType type){
        PizzaComponent pc = null;
        switch (type){
            case DOUGH:
                pc = new Matza();
                break;
            case SAUCE:
                pc = new Tomato();
                break;
            case TOPPING:
                pc = new Salami();
                break;
        }
        return pc;
    }
}
