package Repo.DSA_26x.Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Sets {
    public static void main(String[] args) {
        //1. HashSet : No duplicates, no order , NUll is allowed
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(null);
        hashSet.contains(4); // false
        hashSet.remove(2);
        System.out.println("HashSet: " + hashSet);

        //2. LinkedHashSet : No duplicates, maintains insertion order, Null is allowed
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(null);
        linkedHashSet.contains(4); // false
        linkedHashSet.remove(2);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        //3. TreeSet : No duplicates, sorted order, Null is not allowed
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.contains(4); // false
        treeSet.remove(2);
        // treeSet.add(null); // throws NullPointerException 
        System.out.println("TreeSet: " + treeSet);

    }
}
