import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Programmer {
    private Person person;
    private ProgrammingLanguages languages;
}
