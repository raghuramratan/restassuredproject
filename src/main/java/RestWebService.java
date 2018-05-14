import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

//import static org.hamcrest.Matchers.*;

public class RestWebService {

    public static void main(String[] args){
        //RestAssured resAssured =
        Response res = RestAssured.given().get("http://ergast.com/api/f1/2017/circuits.json");
        System.out.println(res.getBody().asString());
        System.out.println(res.getStatusCode());
        System.out.println(res.getTimeIn(TimeUnit.MILLISECONDS));
    }
}
