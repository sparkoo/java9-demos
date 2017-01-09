public class Main {

    public static void main(String[] args) {
        new Main().safeVarArgsPrivate(1, 2, 3);
        new Main().safeVarArgsPublicFinal("one", "two", "three");
        safeVarArgsStatic("123", "one two three");
    }

    @SafeVarargs
    private <T> void safeVarArgsPrivate(T... varargs) {
        for (T s : varargs) {
            System.out.print(s);
        }
        System.out.println();
    }

    @SafeVarargs
    public final <T> void safeVarArgsPublicFinal(T... varargs) {
        for (T s : varargs) {
            System.out.print(s);
        }
        System.out.println();
    }

    @SafeVarargs
    static <T> void safeVarArgsStatic(T... varargs) {
        for (T s : varargs) {
            System.out.print(s);
        }
        System.out.println();
    }
}
