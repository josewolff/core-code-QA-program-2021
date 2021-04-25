package integrationTesting.get;

import com.google.gson.Gson;
import integrationTest.entities.Users;
import integrationTest.requester.RequestMaker;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUsersGSON {

    @Test(groups = {"apiTesting","get"})
    public void getAllUsers(){
        Response response = RequestMaker.makeGetRequest("http://localhost:5000/users/all");
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

    @Test(groups = {"apiTesting", "get"})
    public void getBYId(){
        Response response = RequestMaker.makeGetRequest("http://localhost:5000/users/findbyid/13");
        String responseString = response.asString();
        Gson gsonGetById = new Gson();
        Users user = gsonGetById.fromJson(responseString, Users.class);
        System.out.println(user.getId());
        System.out.println(user.getEmail());
        System.out.println(user.getFirstname());
        System.out.println(user.getLastname());
    }
}
