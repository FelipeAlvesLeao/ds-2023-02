package org.example;
import java.util.stream.DoubleStream;

public class Main {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
