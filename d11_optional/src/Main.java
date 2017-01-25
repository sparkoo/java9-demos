import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("hello");
        Optional<String> o2 = Optional.empty();

        o1.ifPresentOrElse(System.out::println, () -> System.out.println("missing value"));
        o2.ifPresentOrElse(System.out::println, () -> System.out.println("missing value"));

        // with map
        o1.map(s -> {
            System.out.println(s);
            return s;
        }).orElseGet(() -> {
            System.out.println("missing value");
            return "";
        });
        o2.map(s -> {
            System.out.println(s);
            return s;
        }).orElseGet(() -> {
            System.out.println("missing value");
            return "";
        });
    }
}
