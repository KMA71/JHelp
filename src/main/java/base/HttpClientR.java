/**
 * Http client начиная с openjdk11
 */

package base;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientR {

    private HttpClient client;

    private HttpRequest request;

    private HttpResponse<String> response;

    public HttpClientR() {
        this.client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                //TODO реализовать конструктор для проски (не приоритет)
                //.proxy(ProxySelector.of(new InetSocketAddress("proxy", 80)))
                //TODO реализовать конструктор для аутентификации
                //.authenticator(Authenticator.getDefault())
                .connectTimeout(Duration.ofSeconds(20))
                .build();
    }

    private HttpRequest createPostReq(String urlApiPoint, String reqBody) {
        return HttpRequest.newBuilder()
                .uri(URI.create(urlApiPoint))
                .timeout(Duration.ofMinutes(1))
                //TODO реализовать метод для передачи файлов "application/json"
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(reqBody))
                .build();
    }

    public HttpResponse<String> getPostResponse(String urlApiPoint, String reqBody) throws IOException, InterruptedException {
        this.response =
                this.client.send(createPostReq(urlApiPoint, reqBody), HttpResponse.BodyHandlers.ofString());
/* для отладки
        System.out.println(this.response.statusCode());
        System.out.println(this.response.body());
        System.out.println(this.response.headers());
*/
        return this.response;
    }

}
