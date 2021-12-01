package mock.components;

public class ClientPassport {
    private final String series;
    private final String number;
    private String issueDate; //зависит от внешнего параметра "возраст"
    private final String issueName;
    private final String issueCode;

    public ClientPassport() {
        this.series = "series";
        this.number = "number";
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
}
