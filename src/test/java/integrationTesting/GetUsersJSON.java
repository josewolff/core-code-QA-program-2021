package integrationTesting;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetUsersJSON {

    @Test
    public void getAllUsers(){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:5000/users/all")
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        JSONArray json = new JSONArray(responseString);
        for (int i = 0; i < json.length(); i ++){
            JSONObject jsonObject =  json.getJSONObject(i);
            System.out.println(jsonObject.getInt("_id"));
            System.out.println(jsonObject.getString("username"));
            System.out.println(jsonObject.getString("firstname"));
            System.out.println(jsonObject.getString("lastname"));
        }
        System.out.println(responseString);
    }

    @Test
    public void getBYId(){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:5000/users/findbyid/13")
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        String responseString = response.asString();
        JSONObject json = new JSONObject(responseString);
        System.out.println(json.getInt("_id"));
        System.out.println(json.getString("username"));
        System.out.println(json.getString("firstname"));
        System.out.println(json.getString("lastname"));
    }
}
