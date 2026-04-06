package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -4, 11, -1, -200, 16, -66, 22);
        List<Integer> positive = numbers.stream()
                .filter(number -> number > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}