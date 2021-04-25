package integrationTesting.delete;

import integrationTest.requester.RequestMaker;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.GlobalVariables;

public class UsersDeleteAll {

    @Test(groups = {"apiTesting", "delete"})
    public void deleteAllUsers(){
        Response response = RequestMaker.makeDeleteRequest(GlobalVariables.apiHost + "/users/removeall");
        String responseString = response.asString();
        System.out.println(responseString);
    }


}
