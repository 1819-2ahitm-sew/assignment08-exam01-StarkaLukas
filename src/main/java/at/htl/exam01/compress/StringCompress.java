package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        int number = getNoOfLines(FILE_NAME);
        String[] text = sc.readFromFile(FILE_NAME, number);
        sc.print(text);
    }


    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName, int number) {
        String[] text = new String[number];
        int i = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                text[i] = scanner.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return text;
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public void print(String[] lines) {
        char letter = '0';
        final int LETTERPLACE = 0; //gibt an, an welcher Stelle sich das Zeichen befindet
        StringBuilder sb = new StringBuilder();
        int number = 0;


        for (int i = 0; i < lines.length; i++) {
            letter = lines[i].charAt(LETTERPLACE);
            sb.append(letter);
            String[] parts = lines[i].split(sb.toString());
            number = Integer.valueOf(parts[1]);
            for (int j = 0; j < number; j++) {
                System.out.print(letter);
            }
            System.out.printf("%n");
            sb.deleteCharAt(LETTERPLACE);
        }

    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public static int getNoOfLines(String fileName) {
        int count  = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                count++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        return count;
    }
}
