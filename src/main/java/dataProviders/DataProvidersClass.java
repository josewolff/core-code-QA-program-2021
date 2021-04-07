package dataProviders;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DataProvidersClass {

    @DataProvider(name = "getParameters", parallel = true)
    public Iterator<Object[]> getParameters() {
        Collection<Object[]> data = new ArrayList<>();
        for (int i = 0; i < 500; i++){
            JSONObject bodyContent = new JSONObject();
            bodyContent.put("username","username"+i);
            bodyContent.put("firstname","firstname"+i);
            bodyContent.put("lastname","lastname"+i);
            bodyContent.put("email","email"+i);
            data.add(new Object[]{bodyContent.toString()});
        }
        return data.iterator();
    }
}
