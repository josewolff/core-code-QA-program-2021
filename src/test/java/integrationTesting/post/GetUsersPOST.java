package integrationTesting.post;

import dataProviders.DataProvidersClass;
import integrationTest.requester.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.GlobalVariables;

import java.util.Collection;
import java.util.Iterator;

import static io.restassured.RestAssured.given;

public class GetUsersPOST {

    @Test(dataProviderClass = DataProvidersClass.class, dataProvider = "getParameters", groups = {"apiTesting", "post"})
    public void createNewUser(String bodyContent){
        Response response = RequestMaker.makePostRequest(GlobalVariables.apiHost + "/users/add",bodyContent);
        if(bodyContent.contains("499")){
            Assert.fail("fails");
        }
        String responseString = response.asString();
        System.out.println(responseString);
    }
}
