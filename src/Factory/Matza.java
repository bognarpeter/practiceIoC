package Factory;

/**
 * Created by Peti on 2017.07.18..
 */
public class Matza extends PizzaComponent {
    public Matza(){
        super(PizzaComponentType.DOUGH);
        prepare();
    }
    @Override
    public void prepare(){
        System.out.println("Preparing matza...blee");
    }
}
