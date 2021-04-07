package integrationTesting.delete;

import integrationTest.requester.RequestMaker;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UsersDeleteAll {

    @Test
    public void deleteAllUsers(){
        Response response = RequestMaker.makeDeleteRequest("http://localhost:5000/users/removeall");
        String responseString = response.asString();
        System.out.println(responseString);
    }


}
