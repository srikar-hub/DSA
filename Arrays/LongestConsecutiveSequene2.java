package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequene2 {
    public static void main(String[] args) {
        int[] arr={104,1,2,3,4,105,106,1,1,1,107,108};
        System.out.println(sequence(arr));
    }
    static int sequence(int[] arr){
          int longest = 1;
          int cnt;
        Set<Integer> set = new HashSet<Integer>();
         for(int idx = 0; idx < arr.length; idx++) {    
             set.add(arr[idx]);
         }
         for(int ele:set){
            if(!set.contains(ele-1)){
                cnt=1;
                int x = ele;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt+=1;
                }
                longest=Math.max(longest, cnt);
            }
         }
          return longest;
    }
}
