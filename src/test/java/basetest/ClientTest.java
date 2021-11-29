package basetest;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ClientTest {

    HttpClient httpClient = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().build();

}
