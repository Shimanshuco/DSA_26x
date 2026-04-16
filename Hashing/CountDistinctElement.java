package Repo.DSA_26x.Hashing;

import java.util.HashSet;
public class CountDistinctElement {
    public static int countDistinct(int[] arr) {
        HashSet<Integer>set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 5}; // Duplicates : 1,2
        int count = countDistinct(arr);
        System.out.println("Number of distinct elements: " + count);
    }
    
}
