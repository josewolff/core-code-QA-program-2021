package integrationTesting;

import com.google.gson.Gson;
import integrationTest.Users;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsersGSON {

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
        Gson gson = new Gson();
        Users[] users = gson.fromJson(responseString,Users[].class);
        for (int i = 0; i < users.length; i ++){
            Users user =  users[i];
            System.out.println(user.getId());
            System.out.println(user.getEmail());
            System.out.println(user.getFirstname());
            System.out.println(user.getLastname());
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
        Gson gsonGetById = new Gson();
        Users user = gsonGetById.fromJson(responseString, Users.class);
        System.out.println(user.getId());
        System.out.println(user.getEmail());
        System.out.println(user.getFirstname());
        System.out.println(user.getLastname());
    }
}
