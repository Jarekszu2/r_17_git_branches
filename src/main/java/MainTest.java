import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Car car = new Car("Audi", 2008);
        Car car2 = new Car("Fiat", 2008);
        List<Car> carList = new ArrayList<>(Arrays.asList(car, car2));
        StringBuilder stringCarList = new StringBuilder();
        for (Car c : carList) {
            stringCarList.append(c.toString());
        }
        System.out.println(stringCarList);

        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.saveToFile(stringCarList.toString());

        System.out.println();
        MyFileReader myFileReader = new MyFileReader();
        myFileReader.readFile();
    }
}
