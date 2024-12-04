package Lambada;

import java.util.function.Function;

public class MainClass {
    public static void main(String[] args) {

        Function<Integer, Integer> Sum = (num1) -> num1+1;
        System.out.println(Sum.apply(1));

        TriFunction<Integer, Integer, Integer, Integer, Integer> Calculate = (num1, num2, num3, num4) -> num4+num1+num2*num3;
        System.out.println(Calculate.apply(1, 2, 3, 10));

        // Stream API

    }
}
