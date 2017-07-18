package Observable;

/**
 * Created by Peti on 2017.07.18..
 */
public class MapUnitB implements DataSourceObserver {
    @Override
    public void newDataNotfiy() {
        System.out.println("MapUnitB starts processing");
    }
}
