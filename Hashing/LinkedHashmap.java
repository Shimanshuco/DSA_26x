package Repo.DSA_26x.Hashing;

import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        //In linked hash map, the order of the elements is maintained as they were inserted. 
        // It is implemented as a hash table with a linked list running through it to maintain the order of the elements.
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        //All operations of linked hash map are same as hash map, 
        // but the order of the elements is maintained as they were inserted.
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map); // Output: {1=One, 2=Two, 3=Three}

        //Iteration
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }
    
}
