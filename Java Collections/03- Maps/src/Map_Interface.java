import java.util.*;

public class Map_Interface {

    /*
        - A Map in Java is a collection that stores key-value pairs, where each key is unique,
          and each key maps to a corresponding value.
        - Duplicate keys are not allowed. If a duplicate key is inserted, it overwrites the existing value.
        - Map interface are implemented by:
            HashMap,
            LinkedHashMap,
            and TreeMap.
    */


    public static void main(String[] args) {

        //Initialize map through HashMap class
        Map<String, Integer> hMap = new HashMap<>();

        hMap.put("Kareem", 1);
        hMap.put("Abdelkader", 2);
        hMap.put("Omar", 3);

        System.out.println("The size of the map elements: " + hMap.size());
        System.out.println(("Map's elements: " + hMap));
        System.out.println("Is map contain Kareem? " + hMap.get("Kareem"));
        System.out.println(hMap.keySet());
        System.out.println(hMap.values());
        hMap.clear();
        System.out.println();


        //Initialize map through HashMap class
        //It maintains the order in which key-value pairs were inserted
        Map<Integer, String> products = new LinkedHashMap<>();

        products.put(101, "Laptop");
        products.put(102, "Mouse");
        products.put(103, "Keyboard");

        for ( Map.Entry<Integer, String> e : products.entrySet() ){
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println();


        //Initialize map through HashMap class
        //It automatically sorts keys
        Map<Integer, String> nameID = new TreeMap<>();

        nameID.put(5, "Kareem");
        nameID.put(3, "Mostafa");
        nameID.put(4, "Omar");

        for ( Map.Entry<Integer, String> e : nameID.entrySet() ){
            System.out.println(e);
        }


    }

}
