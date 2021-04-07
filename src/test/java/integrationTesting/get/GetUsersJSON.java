package integrationTesting.get;

import integrationTest.requester.RequestMaker;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class GetUsersJSON {

    @Test
    public void getAllUsers(){
        Response response = RequestMaker.makeGetRequest("http://localhost:5000/users/all");
        String responseString = response.asString();
        JSONArray json = new JSONArray(responseString);
        for (int i = 0; i < json.length(); i ++){
            JSONObject jsonObject =  json.getJSONObject(i);
            System.out.println(jsonObject.getInt("id"));
            System.out.println(jsonObject.getString("username"));
            System.out.println(jsonObject.getString("firstname"));
            System.out.println(jsonObject.getString("lastname"));
        }
        System.out.println(responseString);
    }

    @Test
    public void getBYId(){
        Response response = RequestMaker.makeGetRequest("http://localhost:5000/users/findbyid/1842");
        String responseString = response.asString();
        JSONObject json = new JSONObject(responseString);
        System.out.println(json.getInt("id"));
        System.out.println(json.getString("username"));
        System.out.println(json.getString("firstname"));
        System.out.println(json.getString("lastname"));
    }
}
