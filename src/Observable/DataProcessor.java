package Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peti on 2017.07.18..
 */

public class DataProcessor {
    private List<DataSourceObserver> mapUnitList = new ArrayList<DataSourceObserver>();

    public void registerMapUnit(DataSourceObserver dso){
        this.mapUnitList.add(dso);
        System.out.println("New mapper added");
    }

    public void removeMapUnit(int idx){
        this.mapUnitList.remove(idx);
        System.out.println("A mapper has been deleted");

    }

    public void notifyMapUnits(){
        for(DataSourceObserver dso: mapUnitList){
            dso.newDataNotfiy();
        }
        System.out.println("All mapping units have been notified");
    }
}
