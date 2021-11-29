package mock;

public abstract class Client {


    public interface Builder {
        Client.Builder setPassSeries(String passSeries);
        Client.Builder setPassNumber(String passNumber);
        Client.Builder setPassDate(String passDate);
        Client.Builder setDriverLicenceSeries(String driverLicenceSeries);
        Client.Builder setDriverLicenceNumber(String driverLicenceNumber);
        Client.Builder setAge(byte age);
        Client build();
    }

}
