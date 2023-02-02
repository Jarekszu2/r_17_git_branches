import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Person {
    private String FirstName;
    private String LastName;
    private int age;
    private boolean male;
}
