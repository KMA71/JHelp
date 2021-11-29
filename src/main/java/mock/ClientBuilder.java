package mock;

public class ClientBuilder implements Client.Builder {
    private ClientPassport passport;
    private String driverLicenceSeries;
    private String driverLicenceNumber;
    private byte age;
//    credit history is enum
//    private final HystoryValue historyValue;


    public ClientBuilder() {
        this.passport = new ClientPassport();
        this.driverLicenceSeries = "2222";
        this.driverLicenceNumber = "222222";
        this.age = 30;
    }


    @Override
    public Client.Builder setPassport(String passSeries, String passNumber) {
        this.passport.setSeries(passSeries);
        this.passport.setNumber(passNumber);
        return this;
    }

    @Override
    public Client.Builder setDriverLicenceSeries(String driverLicenceSeries) {
        this.driverLicenceSeries = driverLicenceSeries;
        return this;
    }

    @Override
    public Client.Builder setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
        return this;
    }

    @Override
    public Client.Builder setAge(byte age) {
        this.age = age;
        return this;
    }

    @Override
    public Client build() {
        return new Client(this);
    }
}
