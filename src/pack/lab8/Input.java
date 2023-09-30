package pack.lab8;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Consumer;

public final class Input implements AutoCloseable {
    private final InputStream stream;

    public Input(InputStream stream) {
        this.stream = stream;
    }

    public Input processInt(Consumer<Integer> consumer) {
        try (Scanner scanner = new Scanner(stream)) {
            System.out.print("Введите число: ");
            consumer.accept(scanner.nextInt());
        }
        return this;
    }
    @Override
    public void close() throws Exception {
        stream.close();
    }
}
