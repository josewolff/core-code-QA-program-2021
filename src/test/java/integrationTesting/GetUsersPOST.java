package integrationTesting;

import dataProviders.DataProvidersClass;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Iterator;

import static io.restassured.RestAssured.given;

public class GetUsersPOST {

    @Test(dataProviderClass = DataProvidersClass.class, dataProvider = "getParameters")
    public void getAllUsers(String bodyContent){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(bodyContent.toString())
                .post("http://localhost:5000/users/add")
                .then()
                .assertThat().statusCode(200)
                .extract().response();
        if(bodyContent.contains("499")){
            Assert.fail("fails");
        }
        String responseString = response.asString();
        System.out.println(responseString);
    }


}
