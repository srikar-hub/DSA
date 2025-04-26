package Arrays;

import java.util.*;

public class LongestSubArrayWithSumKWithPostivesAndNegatives {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,10,3,3};
        int k=6;
        System.out.println(sol(arr,k));
    }
    static int sol(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                maxLen = Math.max(maxLen,i-map.get(rem));
            }    
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }  
        }
       return maxLen;
    }
}
