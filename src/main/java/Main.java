import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true))) {
            printWriter.println("Hallo World!");
        } catch (IOException e) {
            System.err.println("Error, unable to open this file and write to it.");
        }
    }
}
