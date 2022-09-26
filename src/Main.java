import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello %s world! from %s%n", getStatus(), getEnv());
    }

    private static String getEnv() {
        return System.getenv("USERNAME");
    }

    @Contract(pure = true)
    private static @NotNull String getStatus() {
        return "beautiful";
    }
}