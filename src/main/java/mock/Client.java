package mock;

public abstract class Client {


    public interface Builder {
        public Builder name(String name);
        public Builder passport();
        public Builder age(byte age);
        public Client build();
    }



}
