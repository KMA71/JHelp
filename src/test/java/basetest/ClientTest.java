package basetest;

import mock.Client;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    void clientTest() {

        System.out.println("***************");
        Client client = Client.newClient()
                .name("Uasya")
                .build();
        System.out.println(client);
        System.out.println("***************");
        Client client1 = Client.newClient(35)
                .name("ThirtyFiver")
                .build();
        System.out.println(client1);
        System.out.println("***************");
    }

}
