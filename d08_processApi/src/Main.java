import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        ProcessHandle.allProcesses()
                .filter(p -> p.info().command().orElse("").contains("top"))
                .forEach(p -> {
                    System.out.println("destroying [" + p.info() + "]");
                    p.destroy();
                });
    }

    static void killMyself() {
        ProcessHandle.allProcesses()
                .filter(p -> !p.info().command().orElse("").contains("java"))
                .forEach(p -> {
                    System.out.println("destroying [" + p.info() + "]");
                    p.destroy();
                    // p.destroyForcibly();
                });
    }
}
