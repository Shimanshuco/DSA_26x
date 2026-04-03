package Repo.DSA_26x.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter the 5 elements of the Array");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be Searched : ");
        int key = sc.nextInt();

        int ans = linearSearch(arr,key);
        if(ans!=-1){
            System.out.println("Element found at index "+ans);
        }else{
            System.out.println("Element not found!");
        }
    }
    
}
