package Repo.DSA_26x.Hashing;

import java.util.TreeMap;
public class TreeHashMap {
    public static void main(String[] args) {
        //In tree hash map the keys are stored in a sorted order. 
        // It is implemented as a red-black tree, which is a self-balancing binary search tree.

        TreeMap<Integer, String> map = new TreeMap<>();
        //All operations of tree hash map are same as hash map,
        // but the keys are stored in a sorted order.
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map); // Output: {1=One, 2=Two, 3=Three}
        //Iteration
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
    
}
