package Repo.DSA_26x.Hashing;

import java.util.HashSet;
public class UnionandIntersection {
    public static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        System.out.println("Union of the two arrays: " + set);

    }

    public static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }
        System.out.println("Intersection of the two arrays: " + intersectionSet);
        
    }
    public static void main(String[] args) {
        //Union
        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 = {3, 4, 5, 6};
        System.out.println("Union of arr1 and arr2:");
        union(arr1, arr2);

        //Intersection
        System.out.println("Intersection of arr1 and arr2:");
        intersection(arr1, arr2);

    }
    
}
