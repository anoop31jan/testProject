package com.test;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NewTest {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> firstList = Arrays.asList(1,2,3,4,5,6);
        List<Integer> secondList = Arrays.asList(3,4,0,1);



        Map<Integer, Integer> overAll = new HashMap<>();

        for(Integer x : firstList)
        {

            Map<Integer, Integer> collect = secondList.stream()
                    .filter(y -> (x + y) % 3 == 0).collect(Collectors.toMap(y -> x, y -> y, (v1,v2)->v1+v2));

            overAll.putAll(collect);

        }

        overAll.forEach((key,value)-> System.out.println("key "+key +"  value "+value));


        List<Integer> collectList= IntStream.range(0, 14).map(num -> random.nextInt(100)).boxed().collect(Collectors.toList());
        System.out.println(collectList);

        Predicate<String> predicate =  s-> s.equalsIgnoreCase("Anoop");

        List<String> list = Arrays.asList("Anoop","Pandey","Hello");


        List<String> collect1 = list.stream().filter(predicate.negate()).collect(Collectors.toList());

        System.out.println(" negate "+collect1);

        int[] num1 = new int[]{4,5,3,7};


        int arr[] = IntStream.rangeClosed(1,15).toArray();
            int numbers[] = {44,5,6,90,34,12,34,8,0,9};

            int sum = IntStream.of(numbers).sum();

        List<Map.Entry<Integer, Long>> collect = IntStream.of(numbers).sorted().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());

        System.out.println("Sum ==> "+sum);


        System.out.println("Sorted Array  ==> "+collect);

        var strings = new ArrayList<String>();

        strings.add("Anoop");
        strings.add("pandey");
        strings.add("anjali");

        strings.stream().forEach(System.out::println);


    }

    interface test{

        private int testCall(){
            return 98;
        }
    }


}
