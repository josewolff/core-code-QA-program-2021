package integrationTesting;

import dataProviders.DataProvidersClass;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsersDelete {

    @Test
    public void getAllUsers(){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .delete("http://localhost:5000/users/removeall")
                .then()
                .assertThat().statusCode(200)
                .extract().response();
        String responseString = response.asString();
        System.out.println(responseString);
    }


}
