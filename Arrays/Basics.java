package Repo.DSA_26x.Arrays;

public class Basics {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size = 5;

        int arr2[] = new int[size];
        arr[1] = 1;
        arr[0]= 1;

        for(int i=2;i<arr2.length;i++){
            arr[i]=i;
        }

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
