import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.saveToFile("Hallo World!");

        MyFileReader myFileReader = new MyFileReader();
        myFileReader.readFile();

        System.out.println();
        int numberOfLines = myFileReader.readFileAndReturnNumberOfLines();
        System.out.println(numberOfLines);

        System.out.println();
        List<Car> carList = new ArrayList<>(Arrays.asList(new Car("Audi", 2007), new Car("Fiat", 2017)));
        StringBuilder stringCarList = new StringBuilder();
        for (Car c : carList) {
            stringCarList.append(c.toString());
        }
        myFileWriter.saveToFile(stringCarList.toString());
        myFileReader.readFile();
    }
}
