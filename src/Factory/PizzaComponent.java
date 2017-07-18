package Factory;

/**
 * Created by Peti on 2017.07.18..
 */
public abstract class PizzaComponent {
    PizzaComponentType type = null;
    public PizzaComponent(PizzaComponentType pct){
        this.type = pct;
    }
    public abstract void prepare();

    public PizzaComponentType getType(){
        return this.type;
    }
    public void setType(PizzaComponentType pct){
        this.type = pct;
    }
}
