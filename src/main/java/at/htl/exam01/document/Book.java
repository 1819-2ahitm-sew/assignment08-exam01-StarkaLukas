package at.htl.exam01.document;

public class Book extends Document {
    private String title;


    public Book(String author, String title) {
        super(author);
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();

        ausgabe.append("'");
        ausgabe.append(title);
        ausgabe.append("' von '");
        ausgabe.append(getAuthor());
        ausgabe.append("'");
        ausgabe.append("\n");

        return ausgabe.toString();
    }



}
