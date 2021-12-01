package basetest;

import mock.Client;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    void clientTest() {

        Client client = Client.newClient()
                .age(35)
                .name("Uasya")
                .build();
        System.out.println(client);
        System.out.println();
    }

}
