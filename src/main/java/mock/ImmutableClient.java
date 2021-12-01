package mock;

import mock.components.ClientPassport;

public class ImmutableClient extends Client {
    private final String name;
    private final ClientPassport passport;
    private final int age;

    public ImmutableClient(ClientBuilder builder){
        this.name = builder.getName();
//        this.passport = builder.getPassport();
        this.age = builder.getAge();
        this.passport = new ClientPassport(25);
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
    protected int age() {
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
