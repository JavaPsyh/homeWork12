package tasks;

import java.util.function.DoubleUnaryOperator;

public class Integrate {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double tenPowSeven = Math.pow(10, 7);
        double step = (b - a) / tenPowSeven;
        double result = f.applyAsDouble(a) * step;
        for (int i = 0; i < tenPowSeven; i++) {
            result += f.applyAsDouble(a += step) * step;
        }
        return result;
    }
}
