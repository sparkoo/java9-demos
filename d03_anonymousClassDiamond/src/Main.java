public class Main {
    public static void main(String[] args) {
        Iface<String> anonymous;
        // java 9
//        anonymous = new Iface<>() {
        // java 8
        anonymous = new Iface<String>() {
            String s = "not set yet";

            @Override
            public String get() {
                return s;
            }

            @Override
            public void set(String s) {
                this.s = s;
            }
        };
        System.out.println(anonymous.get());
        anonymous.set("Hello");
        System.out.println(anonymous.get());
    }

    private interface Iface<T> {
        T get();
        void set(T s);
    }
}
