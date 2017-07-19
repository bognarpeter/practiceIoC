package ServiceLocator;

/**
 * Created by Peti on 2017.07.19..
 */
public class DataAnalyzer implements Application {
    @Override
    public String getName() {
        return "Analyzer";
    }
    @Override
    public void execute() {
        System.out.println("Data analyzing is done!");
    }
}
