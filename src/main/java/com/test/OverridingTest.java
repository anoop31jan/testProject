package com.test;

public class OverridingTest {

     String calculate(String s1, String s2) {
        return "hello";
    }

}


class child extends OverridingTest {

    @Override
     protected String calculate(String s1, String s2) {

        return "";
    }

}