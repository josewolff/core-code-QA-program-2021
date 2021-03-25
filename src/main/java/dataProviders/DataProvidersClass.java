package dataProviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvidersClass {

    @DataProvider(name = "getParameters", parallel = true)
    public Iterator<Object[]> getParameters() {
        List<Object[]> values = new ArrayList<Object[]>();
        for (int i =0; i < 100; i++){
            int expectedResult = i + i;
            values.add(new Object[]{i,i,expectedResult});
        }
        return values.iterator();
    }
}
