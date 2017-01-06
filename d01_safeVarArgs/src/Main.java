public class Main<T> {

    public static void main(String[] args) {
        new Main().safeVarArgsPrivate(1, 2, 3);
        new Main().safeVarArgsPublicFinal("one", "two", "three");
    }

    @SafeVarargs
    private void safeVarArgsPrivate(T... someGenericVars) {
        for (T t : someGenericVars) {
            System.out.println(t);
        }
    }

    @SafeVarargs
    public final void safeVarArgsPublicFinal(T... someGenericVars) {
        for (T t : someGenericVars) {
            System.out.println(t);
        }
    }
}
