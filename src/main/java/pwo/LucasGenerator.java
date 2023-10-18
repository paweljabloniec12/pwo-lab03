package pwo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LucasGenerator {

    public static void main(String[] args) {
        final int n = 100;  // Liczba wyrazów ciągu do wygenerowania
        final String fileName = "lucas_sequence.txt";  // Nazwa pliku wyjściowego

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            long l_1 = 2;  // Pierwszy wyraz ciągu Lucas
            long l_2 = 1;  // Drugi wyraz ciągu Lucas
            writer.write(l_1 + "\n");
            writer.write(+ l_2 + "\n");

            for (int i = 3; i <= n; i++) {
                long current = l_1 + l_2;
                writer.write(current + "\n");
                l_2 = l_1;
                l_1 = current;
            }

            writer.close();
            System.out.println("Wygenerowano i zapisano " + n + " wyrazów ciągu Lucasa do pliku " + fileName);
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisywania do pliku: " + e.getMessage());
        }
    }
}
