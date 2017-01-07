public class Main {

    public static void main(String[] args) {
        new Main().safeVarArgsPrivate("1", "2", "3");
        new Main().safeVarArgsPublicFinal("one", "two", "three");
        safeVarArgsStatic("123");
    }

    @SafeVarargs
    private void safeVarArgsPrivate(String... varargs) {
        for (String s : varargs) {
            System.out.println(s);
        }
    }

    @SafeVarargs
    public final void safeVarArgsPublicFinal(String... varargs) {
        for (String s : varargs) {
            System.out.println(s);
        }
    }

    @SafeVarargs
    static void safeVarArgsStatic(String... varargs) {
        for (String s : varargs) {
            System.out.println(s);
        }
    }
}
