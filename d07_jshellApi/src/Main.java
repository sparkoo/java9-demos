import jdk.jshell.JShell;

public class Main {
    public static void main(String[] args) {
        try (JShell jShell = JShell.create()) {
            jShell.eval("int a = 5;");
            jShell.eval("int b = 6;");
            jShell.eval("int c = a + b;");
            jShell.variables().forEach(
                    v -> log(v.name() + " = " + jShell.varValue(v)));
        }
    }

    private static void log(String message) {
        System.out.println(message);
    }
}
