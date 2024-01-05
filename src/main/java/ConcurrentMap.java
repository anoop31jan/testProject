import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {


    public static void main(String[] args) {

        Map<String, String> mapTest = new HashMap<>();

        mapTest.put("1","Anoop");
        mapTest.put("2","Anjali");
        mapTest.put("3","Ayansh");
        mapTest.put("4", "Om");

        Iterator<Map.Entry<String, String>> iterator =
                mapTest.entrySet().iterator();

        while (iterator.hasNext()){


            if (iterator.next().getKey().equalsIgnoreCase("2"))
                iterator.remove();
        }

        System.out.println(mapTest);

//        for (Map.Entry entry : mapTest.entrySet()){
//
//
//            System.out.println(" key "+ entry.getKey() +" value "+ entry.getValue());
//
//            if( entry.getKey().equals("2"))
//            mapTest.remove(entry.getKey());
//
//        }


    }

}
