import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LT {


    public static void main(String[] args) {

        List<Integer>  list = Arrays.asList(1,3,5,9,9,4,6,7,8,8,4);


        Set<Integer> unique = new HashSet<>();

        List<Integer> duplicate  = list.stream().filter(number -> !unique.add(number)).collect(Collectors.toList());


        Set<Integer> integerList = list.stream().filter(number -> Collections.frequency(list, number) > 1).collect(Collectors.toSet());

        
        System.out.println(duplicate);

        System.out.println(" integerList "+integerList);


       Integer num = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(1);


        Map<Integer, Long> collect2 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        List<Map.Entry<Integer, Long>> entries = collect2.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList());


        System.out.println("num ->"+num +" tets "+collect2 + "  new "+entries.get(1).getKey());

    }

}
