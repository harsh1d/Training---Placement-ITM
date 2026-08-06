package day2.task3;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Mango");
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Apple");

        // duplicate won't be added or inserted in the collection
        fruitsSet.remove("Banana");
        fruitsSet.add("Cherry");

        System.out.println("\nSet : " + fruitsSet);
        System.out.println("Set Contains Apple: " + fruitsSet.contains("Apple"));

        // map

        Map<String, Integer> fruitsPrice = new HashMap<>();
        fruitsPrice.put("Apple", 2);
        fruitsPrice.put("banana", 50);
        fruitsPrice.put("Papaya", 4);
        fruitsPrice.put("Plums",100);
        fruitsPrice.put("Mango", 150); // update ???

        System.out.println("\nMap : " + fruitsPrice);
        System.out.println("Map get Apples :" + fruitsPrice.get("Apple"));

        System.out.println("Map contain key Grapes: " + fruitsPrice.containsKey("Grapes"));

        System.out.println("Map contain value 50: " + fruitsPrice.containsValue(50));
        
        // System.out.println("\nFruits and their prices:");
        // for (String fruit : fruitsPrice.keySet()) {
        //     System.out.println(fruit + ": $" + fruitsPrice.get(fruit));
        // }


        Map<String, Long> fruitsPrice1 = new HashMap<>();
        fruitsPrice1.put("Apple", 2L);
        fruitsPrice1.put("banana", 50L);
        fruitsPrice1.put("Papaya", 4L); 
        
    }
}