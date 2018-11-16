//Lukas Starka

package at.htl.exam01.document;

public class Main {

    /*
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sie die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        Document[] docs = new Document[]{new Book("Rowlings", "Harry Potter und der Stein der Weisen"), new Email("Susi", "CoolCompany", "Bewerbung"), new Book("Tolkien", "lordOftheRings")};
        writeOutput(docs);
    }

    private static void writeOutput(Document[] document) {
        int counterBooks = 0;
        int counterEmails = 0;
        String pluralVSsingularBooks = "";
        String pluralVSsingularEmails = "";

        for (int i = 0; i < document.length; i++) {
            if (document[i] instanceof Email) {
                System.out.printf("Email: %s", document[i].toString());
                counterEmails++;
            } else if (document[i] instanceof Book) {
                System.out.printf("Book: %s", document[i].toString());
                counterBooks++;
            }
        }
        if (counterBooks > 1) {
            pluralVSsingularBooks = "Bücher";
        }
        else{
            pluralVSsingularBooks = "Buch";
        }
        if (counterEmails > 1) {
            pluralVSsingularEmails = "Emails";
        }
        else{
            pluralVSsingularEmails = "Email";
        }
        System.out.printf("%nAnzahl %s: %d%nAnzahl %s: %d", pluralVSsingularBooks, counterBooks, pluralVSsingularEmails, counterEmails);
    }

}
