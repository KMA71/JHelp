package mock;

import mock.components.ClientPassport;

public abstract class Client {

    public static Builder newClient() {
        return new ClientBuilder();
    }

    protected abstract String name();
    protected abstract ClientPassport passport();
    protected abstract int age();

    public interface Builder {
        public Builder name(String name);
        public Builder passport();
        public Builder age(int age);
        public Client build();
    }



}
