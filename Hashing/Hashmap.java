package Repo.DSA_26x.Hashing;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void iterateonHashMap(){
        HashMap<Integer , Integer > map = new HashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        //1. Iterate using keySet() method
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println("Key : " + key + " Value : " + map.get(key));
        }
        System.out.println();
        //2. Iterate using entrySet() method
        for(HashMap.Entry<Integer , Integer> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

    }
    public static void main(String[] args) {
        //1. Create a HASHMAP using : HashMap<keyType , valueType> map = new HashMap();
        HashMap<Integer , Integer> map = new HashMap();
        //2. Insert a key-value pair in the map : map.put(key , value);
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        //3. Get the value of a key : map.get(key);
        System.out.println(map.get(2)); //20
        //4. Check if a key is present in the map : map.containsKey(key);
        System.out.println(map.containsKey(3)); //true
        //5. Remove a key-value pair from the map : map.remove(key);
        map.remove(3);
        //6. Get the size of the map : map.size();
        System.out.println(map.size()); //2
        //7. Check if map is empty : map.isEmpty();
        System.out.println(map.isEmpty()); //false
        //8. Clear the map : map.clear();
        map.clear();
        System.out.println(map.isEmpty()); //true
        System.out.println();
        
        //Iteration
        iterateonHashMap();
    }
    
}
