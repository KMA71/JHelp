package mock;

public class ClientPassport {
    private String series;
    private String number;
//    private String issuerDate;
//    private String issuerName;
//    private String issuerCode;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
