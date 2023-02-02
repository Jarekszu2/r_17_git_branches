import java.util.*;
import java.util.stream.Collectors;

public class MainProgrammer {
    public static void main(String[] args) {
        Person person1 = new Person("Jearzy", "Jurek", 28, true);
        Person person2 = new Person("Ania", "Anna", 35, false);
        Person person3 = new Person("Manny", "Maniek", 41, true);
        Person person4 = new Person("Alicja", "Ala", 17, false);

        ProgrammingLanguages languages1 = new ProgrammingLanguages(Arrays.asList("Java", "Cobol", "Cpp"));
        ProgrammingLanguages languages2 = new ProgrammingLanguages(Arrays.asList("Java", "Cobol", "Cpp", "Scala"));
        ProgrammingLanguages languages3 = new ProgrammingLanguages(Arrays.asList("C#;C".split(";")));
        ProgrammingLanguages languages4 = new ProgrammingLanguages(Arrays.asList("C#;C;Java".split(";")));

        Programmer programmer1 = new Programmer(person1,languages1);
        Programmer programmer2 = new Programmer(person2,languages2);
        Programmer programmer3 = new Programmer(person3,languages3);
        Programmer programmer4 = new Programmer(person4,languages4);

        List<Programmer> programmerList = new ArrayList<>(Arrays.asList(programmer1, programmer2, programmer3, programmer4));
        programmerList.forEach(System.out::println);

        List<String> names = programmerList.stream()
                .map(programmer -> programmer.getPerson().getLastName())
                .collect(Collectors.toList());

        Set<String> languagesSet = programmerList.stream()
                .map(Programmer::getLanguages)
                .flatMap(programmingLanguages -> programmingLanguages.getLanguages().stream())
                .collect(Collectors.toSet());

        System.out.println();
        languagesSet.forEach(System.out::println);

        Map<String, Long> map = languagesSet.stream()
                .collect(Collectors.toMap(
                        l -> l,
                        l -> programmerList.stream()
                                    .map(Programmer::getLanguages)
                                    .flatMap(programmingLanguages -> programmingLanguages.getLanguages().stream())
                                    .filter(s -> s.equals(l))
                                    .count()
                ));

        System.out.println();
        map.forEach((k, v) -> System.out.println(k + " " + v));

        Map<String, Long> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println();
        sortedMap.forEach((k, v) -> System.out.println(k + " " + v));

        List<DTO_StringLong> list = new ArrayList<>();
        Set<Map.Entry<String, Long>> set = sortedMap.entrySet();
        for (Map.Entry<String, Long> stringLongEntry : set) {
            list.add(new DTO_StringLong(stringLongEntry.getKey(),stringLongEntry.getValue()));
        }
        System.out.println();
        list.forEach(System.out::println);

        System.out.println();

        System.out.println("Najmniej: " + list.get(0).getLanguage() + " " + list.get(0).getNumber());
    }
}
