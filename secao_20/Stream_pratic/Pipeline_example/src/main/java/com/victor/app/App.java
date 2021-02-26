package com.victor.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = intList.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        // arg0 -> elemento neutro 0 pra soma e 1 pra multiplicação
        int sum = intList.stream().reduce(0, (x, y) -> x + y);

        System.out.println("Soma: " + sum);

        // pegar somente os pares, multiplicar por 10
        List<Integer> newList = intList.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

        System.out.println(newList);
    }
}
