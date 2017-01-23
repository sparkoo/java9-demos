import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        Stream.iterate(0, i -> i < 5, i -> i + 1)
                .forEach(System.out::println);
    }
}
