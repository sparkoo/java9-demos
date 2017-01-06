public class Main {
    int _ = 3;
    void _() {
        System.out.println("called _()");
        System.out.println("_ is " + _);
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        new Main()._();
    }
}
