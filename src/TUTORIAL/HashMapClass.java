package TUTORIAL;

import java.util.HashMap;

public class HashMapClass {
    public static void main (String [] args){

        // HashMap =  A data structure that stores key-value pairs
        //            Keys are Unique, but Values can be duplicated
        //            Does not maintain any order, but it's memory efficient
        //            HashMap <Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("banana", 0.25);
        map.put("orange", 0.75);
        map.put("coconut", 1.00);

        System.out.println(map);

        map.remove("apple");
        System.out.println(map);

        System.out.println(map.get("coconut"));

        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsKey("pineapple"));

        if(map.containsKey("banana")){
            System.out.println(map.get("banana"));
        }else{
            System.out.println("Key not found!");
        }

        if(map.containsKey("pineapple")){
            System.out.println(map.get("pineapple"));
        }else{
            System.out.println("Key not found!");
        }

        System.out.println(map.containsValue(1.00));

        System.out.println(map.size());


        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }


    }
}
