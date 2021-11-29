package mock;

public class Client {

  //  private final ClientPassport passport;
    private final String driverLicenceSeries;
    private final String driverLicenceNumber;
    private final byte age;

    public Client(Client.Builder builder) {
    //    this.passport = (ClientPassport) builder.setPassport("1111", "111111");
        this.driverLicenceSeries = String.valueOf(builder.setDriverLicenceSeries("2222"));
        this.driverLicenceNumber = String.valueOf(builder.setDriverLicenceNumber("222222"));
        this.age = 20;
    }

    public static Client.Builder newBuilder() {
        return new ClientBuilder();
    }

    public interface Builder {
        Client.Builder setPassport(String passSeries, String passNumber);
        Client.Builder setDriverLicenceSeries(String driverLicenceSeries);
        Client.Builder setDriverLicenceNumber(String driverLicenceNumber);
        Client.Builder setAge(byte age);
        Client build();
    }

    @Override
    public String toString() {
        return "{'driverNum': '"+this.driverLicenceNumber+"','age': "+this.age+"'}";
    }

}
