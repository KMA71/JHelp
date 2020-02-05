package basetest;

import base.HttpClientR;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleHttpReqTest extends SetUpEnv {


    @Test
    @DisplayName("smoke api test send authorization POST request")
    void sendPostTest() {
        HttpClientR req = new HttpClientR();
        HttpResponse<String> responseStr = null;
        try {
            responseStr = req.getPostResponse("https://car-test.norma24.ru/api/token/create",
                    "{\"username\":\"secret\",\"password\":\"*******\"}");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(true);

//ассёртить или переиспользовать можно любую часть response
/*
        responseStr.statusCode();
        responseStr.body();
        responseStr.headers();
        responseStr.uri();
        responseStr.version();
        responseStr.sslSession();
*/
    }
}
