import java.io.Closeable;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // java 9
//        SomeCloseableClass s = new SomeCloseableClass();
//        try (s) {
        // java 8
        try (SomeCloseableClass s = new SomeCloseableClass()) {
            System.out.println("do something");
        }
        // fail java 9. not effectively final
//        s = new SomeCloseableClass();
    }

    private static class SomeCloseableClass implements Closeable {
        @Override
        public void close() throws IOException {
            System.out.println("closing");
        }
    }
}
