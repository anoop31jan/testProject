package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sapient {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("anoop");
        list.add("sony");
        list.add("shyam");
        list.add("babu");
        list.add("print");
        list.add("anjali");
        list.add("anjali");
        list.add("anoop");
        list.add("anoop");
        list.add("Sahiba");
        list.add("pankaj");
        list.add("done");



   list = list.stream()
                .map(s ->  {

                    if (s.startsWith("S") || s.startsWith("s"))
                        return "abc";

                    return s;
                })
                .collect(Collectors.toList());

   list.removeIf(s-> s.startsWith("p"));




       System.out.println(list);



       Set<String> set = new HashSet<>();

       set.addAll(list);

       System.out.println(set);
    }



}
