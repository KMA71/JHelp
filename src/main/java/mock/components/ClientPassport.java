package mock.components;

public class ClientPassport {
    private final String series;
    private final String number;
    private final String issueDate;
    private final String issueName;
    private final String issueCode;

    public ClientPassport() {
        this.series = "series";
        this.number = "number";
        this.issueDate = "someDate";
        this.issueName = "issueName";
        this.issueCode = "issueCode";
    }

    public ClientPassport(int age) {
        this.series = "series";
        this.number = "number";
        this.issueDate = "someDate" + "_" + age;
        this.issueName = "issueName";
        this.issueCode = "issueCode";
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getIssueName() {
        return issueName;
    }

    public String getIssueCode() {
        return issueCode;
    }

    @Override
    public String toString() {
        return "ClientPassport{" +
                "series='" + series + '\'' +
                ", number='" + number + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", issueName='" + issueName + '\'' +
                ", issueCode='" + issueCode + '\'' +
                '}';
    }
}
