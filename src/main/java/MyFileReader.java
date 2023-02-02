import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyFileReader {
    int readFileAndReturnNumberOfLines(){
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

    void readFile(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
