package at.htl.exam01.document;

public class Email extends Document {
    private String to;
    private String subject;

    public Email(String author, String to, String subject) {
        super(author);
        this.to = to;
        this.subject = subject;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();

        ausgabe.append("'");
        ausgabe.append(getSubject());
        ausgabe.append("' von '");
        ausgabe.append(getAuthor());
        ausgabe.append("' an '");
        ausgabe.append(getTo());
        ausgabe.append("'");
        ausgabe.append("\n");

        return ausgabe.toString();
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }
}
