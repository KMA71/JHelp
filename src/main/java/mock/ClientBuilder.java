package mock;

import mock.components.ClientPassport;

public class ClientBuilder implements Client.Builder {
    private String name;
    private ClientPassport passport;
    private byte age;

/**Getters*/
    public String getName() {
        return name;
    }

    public ClientPassport getPassport() {
        return passport;
    }

    public byte getAge() {
        return age;
    }
/**Getters END*/

    @Override
    public Client.Builder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Client.Builder passport() {
        return this;
    }

    @Override
    public Client.Builder age(byte age) {
        this.age = age;
        return this;
    }

    @Override
    public Client build() {
        return null;
    }
}
