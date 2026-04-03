package Repo.DSA_26x.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[] , int key){
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]==key){
                return mid;
            }if(arr[mid]>key){
                ei = mid-1;
            }else {
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 4;
        // int key = 2;
        // int key = 55;
        int ans = binarySearch(arr,key);
        if(ans!=-1){
            System.out.println("Element found at index "+ans);
        }else{
            System.out.println("Element not found");
        }
    }
    
}
