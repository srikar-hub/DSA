package arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence1 {
    public static void main(String[] args) {
        int arr[] = {102,4,100,1,101};
        System.out.println(longestConsective(arr));
    }
    static int longestConsective(int[] arr){
           int cnt = 0;
           int lastSmaller = Integer.MIN_VALUE;
           int longest = 1;
           Arrays.sort(arr);
           for(int i=0;i<arr.length;i++){
               if(arr[i]-1==lastSmaller){
                cnt+=1;
                lastSmaller=arr[i];
               }
               else if(arr[i]!=lastSmaller){
                cnt=1;
                lastSmaller=arr[i];
               }
               longest=Math.max(cnt, longest);
           }
           return longest;
    }
}
