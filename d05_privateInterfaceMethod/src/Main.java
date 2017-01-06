public class Main {

    public static void main(String[] args) {
        Iface iface = () -> System.out.println("public");
//        iface.doSomethingPrivate();
        iface.doSomethingPublic();
        iface.doSomethingDefault();
    }
}

interface Iface {
    void doSomethingPublic();

    default void doSomethingDefault() {
        System.out.println("default");
        doSomethingPrivate();
    }

    //java 9
//    private void doSomethingPrivate() {
    //java 8
    default void doSomethingPrivate() {
        System.out.println("private");
    }
}