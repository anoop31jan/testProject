import java.util.*;
import java.util.stream.Collectors;

public class SalaryTest {


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Anoop",1000);
        map.put("Anjali",500);
        map.put("Mark",1300);
        map.put("Jason",1400);
        map.put("Angela",1500);
        map.put("Om",900);
        map.put("Babu",2100);




        Map<String, Integer> map2 = new HashMap<>();

        map2.put("Anoop",1000);
        map2.put("Anjali",1000);
        map2.put("Mark",1300);
        map2.put("Jason",1300);
        map2.put("Angela",1300);
        map2.put("Om",900);


        Map.Entry<Integer, List<String>> integerListEntry = map2.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
                .get(1);


        System.out.println(" map 2 ==>> "+integerListEntry);

//
//        Map.Entry<String, Integer> stringIntegerEntry = getStringIntegerEntry(map, 2);
//
//        System.out.println(stringIntegerEntry.getKey()+"  "+stringIntegerEntry.getValue());
//

//
//        Map.Entry<Integer, List<String>> integerListEntry = map2.entrySet().stream()
//                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
//                .entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//                .collect(Collectors.toList())
//                .get(2);
//
//        System.out.println(" second map "+ integerListEntry.getKey() +"  "+integerListEntry.getValue());
//
//        List<String> nameList = Arrays.asList("Anoop","Anjali","Anoop","Om","Om","Ayansh","Pandey","Anjali","Anjali");
//
//        List<String> namList1 = new ArrayList<>();

    }

    private static Map.Entry<String, Integer> getStringIntegerEntry(Map<String, Integer> map, int num) {
        return map.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toList()).get(num-1);
    }
}
