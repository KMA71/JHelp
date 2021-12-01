package mock;

import mock.components.ClientPassport;

public class ClientBuilder implements Client.Builder {
    private String name;
    private ClientPassport passport;
    private int age;

    public ClientBuilder() {
        this.name = "defaultName";
//        this.passport = new ClientPassport();
        this.age = 30;
    }

/**Getters*/
    public String getName() {
        return name;
    }

    public ClientPassport getPassport() {
        return passport;
    }

    public int getAge() {
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
    public Client.Builder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Client build() {
        return new ImmutableClient(this);
    }
}
