import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "Peter Piper picked a peck of pickled peppers\n" +
                      "A peck of pickled peppers Peter Piper picked\n" +
                      "If Peter Piper picked a peck of pickled peppers\n" +
                      "Where's the peck of pickled peppers Peter Piper picked?";

        FileWriter fw = new FileWriter("sample.txt");
        fw.write(text);
        fw.close();

        int pe = 0, pi = 0;

        FileReader fr = new FileReader("sample.txt");
        int ch;
        String data = "";

        while ((ch = fr.read()) != -1) {
            data += (char) ch;
        }
        fr.close();

        data = data.toLowerCase();

        for (int i = 0; i < data.length() - 1; i++) {
            String pattern = data.substring(i, i + 2);

            if (pattern.equals("pe"))
                pe++;
            if (pattern.equals("pi"))
                pi++;
        }

        System.out.println("'pe' - no of occurrences - " + pe);
        System.out.println("'pi' - no of occurrences - " + pi);
    }
}
