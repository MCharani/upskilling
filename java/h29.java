import java.util.List;

record Person(String name, int age) {}

public class h29 {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ravi", 20),
                new Person("Anu", 17),
                new Person("Kiran", 22)
        );

        people.stream()
                .filter(p -> p.age() >= 18)
                .forEach(System.out::println);
    }
}