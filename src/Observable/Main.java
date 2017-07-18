package Observable;

/**
 * Created by Peti on 2017.07.18..
 */

/*
* Example for Observable Pattern based on MapReduce
* The following code implements a DataProcessor which
* distributes the incoming data to the Map workers
* */
public class Main {
    public static void main(String[] args){
        DataProcessor proc = new DataProcessor();
        proc.registerMapUnit(new MapUnitA());
        proc.registerMapUnit(new MapUnitB());
        //Something happening...
        proc.notifyMapUnits();
        proc.removeMapUnit(0);
    }
}
