package com.test;

import java.util.stream.IntStream;

public class PrimeNumber {


    public static void main(String[] args) {


        int upperLimit = 50; // Adjust the upper limit as needed

        // Use a stream to generate numbers from 2 to the upper limit
        IntStream.rangeClosed(2, upperLimit)
                .filter(PrimeNumber::isPrime)
                .forEach(System.out::println);

        boolean isPrime  = isPrimeCheck(23);

        System.out.println(" is prime "+ isPrime);

        printfabbinoci(12);


    }

    private static boolean isPrimeCheck(int num) {

        for (int i=2 ; i <= Math.sqrt(num);i++){

            if (num %i == 0) return false;




        }
        return true;
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }

 public static void printfabbinoci(int count){
     int a = 0;
     int b = 1;
     int c = 1;

     for (int i = 1; i <= count; i++) {
         System.out.print(a + ", ");

         a = b;
         b = c;
         c = a + b;
     }
 }

}
