package mock;

import mock.components.ClientPassport;

public class ImmutableClient extends Client {
    private final String name;
    private final ClientPassport passport;
    private final byte age;

    public ImmutableClient(ClientBuilder builder){
        this.name = builder.getName();
        this.passport = builder.getPassport();
        this.age = builder.getAge();
    }

    @Override
    protected String name() {
        return name;
    }

    @Override
    protected ClientPassport passport() {
        return passport;
    }

    @Override
    protected byte age() {
        return age;
    }




    @Override
    public String toString() {
        return "ImmutableClient{" +
                "name='" + name + '\'' +
                ", passport=" + passport +
                ", age=" + age +
                '}';
    }
}
