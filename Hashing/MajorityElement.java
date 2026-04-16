package Repo.DSA_26x.Hashing;

import java.util.HashMap;
public class MajorityElement {
    public static int findMajorityElementusingHashMap(int[] nums, int count) {
        HashMap<Integer , Integer> countMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        int majorityElement = nums[0];
        for(Integer key : countMap.keySet()){
            if(countMap.get(key) > count){
                majorityElement = key;
            }
        }
        return majorityElement;

    }
    public static int findMajorityElementusingBoyerMooreVotingAlgorithm(int[] nums) {
        // Boyer-Moore Voting Algorithm
        // This algorithm finds the majority element in O(n) time and O(1) space
        // It works by maintaining a count and a candidate for the majority element.
        int candidate = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
        

    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int count = 3;
        int majorityElement = findMajorityElementusingHashMap(arr,count);
        System.out.println("The majority element is: " + majorityElement);

        int nums2[] = {1,2,3,5,1,3,1,3,1};
        int count2 = nums2.length/3;
        int majorityElement2 = findMajorityElementusingHashMap(nums2,count2);
        System.out.println("The majority element is: " + majorityElement2);

        int majorityElement3 = findMajorityElementusingBoyerMooreVotingAlgorithm(arr);
        System.out.println("The majority element is: " + majorityElement3);
    }
    
}
