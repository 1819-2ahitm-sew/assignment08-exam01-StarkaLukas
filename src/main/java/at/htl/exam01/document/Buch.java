package at.htl.exam01.document;

public class Buch extends Document {
    private String autor;
    private String titel;

    public Buch(String autor, String titel) {
        this.autor = autor;
        this.titel = titel;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();

        ausgabe.append("'");
        ausgabe.append(titel);
        ausgabe.append("' von '");
        ausgabe.append(autor);
        ausgabe.append("'");
        ausgabe.append("\n");

        return ausgabe.toString();
    }

    //region Getter und Setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
    //endregion-
}
