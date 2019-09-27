package basetest;

import base.SimpleDBQuerry;
import org.junit.jupiter.api.Test;

public class SimpleDBQuerryTest {

    SimpleDBQuerry simpleDBQuerry = new SimpleDBQuerry();

    @Test
    void queryString() {
        String result = simpleDBQuerry.getIntQuery("SELECT errors_limit FROM `user` WHERE username = \"nfb\"", "errors_limit", "portal");
        System.out.println(result);
    }
}
