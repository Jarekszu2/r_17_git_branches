import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
//@Data
public class Car {
    private String name;
    private int age;

    public void printCarList(List<Car> carList) {
        carList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Car" + '\n' +
                "name=" + name + '\n' +
                "age=" + age + '\n';
    }
}
