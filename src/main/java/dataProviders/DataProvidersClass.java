package dataProviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvidersClass {

    @DataProvider(name = "getParameters", parallel = true)
    public Iterator<Object[]> getParameters() {
        return null;
    }
}
