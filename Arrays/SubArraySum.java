package Repo.DSA_26x.Arrays;

public class SubArraySum {
    public static int subArryBruteForce(int arr[]){
        int sumg = 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j =i;j<arr.length;j++){
                int sum = 0;
                int end = j;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                    sumg=Math.max(sum,sumg);
                }
            }
        }
        return sumg;
    }

    //Idea of Kadan's Algo 
    //Add case : 
        // (+ve) + (+ve) = (+ve)
        // (+ve) + small(-ve) = (+ve)
    // Ignore Case : 
        // (-ve) + (-ve) = (-ve)
        // (-ve) + small (+ve) = (-ve)
    public static int kadansAlgo(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            ms = Math.max(ms, cs); //If placed here handles all negative array case also
            if(cs<0){
                cs=0;
            }
            //Math.max(ms, cs); //If placed here doesn't handles negative array case also
        }
        return ms;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5}; //15
        int arr[] = {-2,-3,4,-1,-2,1,5,-3}; //7
        int sum = subArryBruteForce(a);
        System.out.println("Max Subarry sum is : "+sum);
        System.out.println("Max Subarry sum is : "+kadansAlgo(arr));
    }
    
}
