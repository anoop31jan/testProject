import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppTest {

    public static void main(String[] args) {

        int [] intarray = new int[]{0,1,1,1,0,0,0,1,0,0,1,1,1,0};

        int[] sortedArray = IntStream.of(intarray)
                .sorted()
                .toArray();




        System.out.println(" sorted array "+ Arrays.toString(sortedArray));

        int[] intArray = {1, 2, 3, 4, 5,9,6,88,43,90,12};

        int sortedArr[] = IntStream.of(intArray).sorted().toArray();

        System.out.println(" sorted Array ===> "+Arrays.toString(sortedArr) + "   "+ sortedArr[sortedArr.length-1]);

        // Example 1: Iterate over the array using IntStream forEach
        IntStream.of(intArray).forEach(System.out::println);

        // Example 2: Use IntStream to perform operations
        int sum = IntStream.of(intArray).sum();
        System.out.println("Sum: " + sum);

        // Example 3: Map each element to its square
        int[] squaredArray = IntStream.of(intArray).map(x -> x * x).toArray();
        System.out.println("Squared Array: " + Arrays.toString(squaredArray));

        // Example 4: Filter elements greater than 2
        int[] filteredArray = IntStream.of(intArray).filter(x -> x > 2).toArray();
        System.out.println("Filtered Array: " + Arrays.toString(filteredArray));

        // Example 5: Get statistics (min, max, sum, average)
        IntSummaryStatistics stats = IntStream.of(intArray).summaryStatistics();
        System.out.println("Statistics: " + stats);


        String str = "ABC";

        String str1 = new String("ABC").intern();
        String str2 = new String("ABC");


        System.out.println(str == str1 );

        System.out.println(str1 == str2  );

        System.out.println(str == str2 );

        String str3 = "ABC";

        System.out.println(str == str3 );


        double[] doubArr = {1, 2.6, 3.8, 4.9, 5.4};

       Double[] temp  = new Double[5];
       int i =0;

       for(double d : doubArr){

           temp[i] = d;
           i++;
       }


       Double doubSum =  Arrays.asList(temp).stream().reduce(0.0, (a,b)->a+b);


       System.out.println(doubSum);
    }
}
