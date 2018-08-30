package com.zgs.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeExample {

    public static void main(String[] args) {


        // range
        IntStream.range(1, 50).boxed().forEach(System.out::println);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println("====求交集===");

        List<Integer> list = list1.stream().filter(list2::contains).collect(Collectors.toList());
        list.forEach(System.out::println);


        System.out.println("====求差集===");
        list = list1.stream().filter(t -> !list2.contains(t)).collect(Collectors.toList());
        list.forEach(System.out::println);


        System.out.println("====求并集===");

        list.addAll(list1);
        list.addAll(list2);
        list = list.stream().distinct().collect(Collectors.toList());
        list.forEach(System.out::println);


    }
}
