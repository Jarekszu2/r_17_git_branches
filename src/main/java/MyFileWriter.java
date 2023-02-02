import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MyFileWriter {
    void saveToFile(String line) {
        // zapisz linię "Hallo World!" w trybie append (dopisywanie do pliku po każdorazowym uruchomienie aplikacji)
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true))) {
            printWriter.println(line);
        } catch (IOException e) {
            System.err.println("Error, unable to open this file and write to it.");
        }
    }

    public void saveCarList(List<Car> carList) {
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("date.txt", true))) {
            for (Car car : carList) {
                printWriter.println(car.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
