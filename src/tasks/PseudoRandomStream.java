package tasks;

import java.util.stream.IntStream;

public class PseudoRandomStream {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, number -> ((number * number) / 10) % 1000);
    }

    public static void main(String[] args) {
        pseudoRandomStream(13).forEach(System.out::println);
    }
}
