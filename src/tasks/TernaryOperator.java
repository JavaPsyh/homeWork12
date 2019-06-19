package tasks;

import java.util.function.Function;
import java.util.function.Predicate;

public class TernaryOperator<T, U> {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (z) -> condition.test(z) ? ifTrue.apply(z) : ifFalse.apply(z);
    }
}
