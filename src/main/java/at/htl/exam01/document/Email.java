package at.htl.exam01.document;

public class Email extends Document {
    private String absender;
    private String empfaenger;
    private String betreff;

    public Email(String absender,  String betreff, String empfaenger) {
        this.absender = absender;
        this.betreff = betreff;
        this.empfaenger = empfaenger;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();

        ausgabe.append("'");
        ausgabe.append(betreff);
        ausgabe.append("' von '");
        ausgabe.append(absender);
        ausgabe.append("' an '");
        ausgabe.append(empfaenger);
        ausgabe.append("'");
        ausgabe.append("\n");

        return ausgabe.toString();
    }

    //region Getter und Setter
    public String getAbsender() {
        return absender;
    }

    public void setAbsender(String absender) {
        this.absender = absender;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(String empfaenger) {
        this.empfaenger = empfaenger;
    }

    public String getBetreff() {
        return betreff;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }
    //endregion
}
