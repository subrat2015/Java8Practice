package com.subrat.misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StudentsQuestion1 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Zohne", "Redy", "Zohne", "Redy", "Stome","Redy");

        System.out.println(words.stream()
                .collect(Collectors.groupingBy(s->s, Collectors.counting()))
                .entrySet().stream().max(((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1)).get().getKey());

        System.out.println(words.stream()
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet().stream().min(((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1)).get().getKey());



        Map<String, Long> frequentChars = words.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println(frequentChars);


    }


}