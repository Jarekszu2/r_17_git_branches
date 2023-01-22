import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public int readFileAndReturnNumberOfLines(){
        int counter = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("Liczba linii w pliku: " + counter);
        return counter;
    }
}