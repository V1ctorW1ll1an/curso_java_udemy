package com.victor.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1200, 1, 400, 3);

        Stream<Integer> st1 = intList.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "João", "carlos");

        System.out.println(Arrays.toString(st2.toArray()));

        // limit, define o limite por quantidade de argumentos
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2).limit(20);

        System.out.println(Arrays.toString(st3.toArray()));

        // Stream fibonacci

        Stream<Long> fibonacci = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] })
                .map(p -> p[0]).limit(10);

        System.out.println(Arrays.toString(fibonacci.toArray()));
    }
}
