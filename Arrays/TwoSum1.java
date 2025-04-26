package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int arr[] = {1,2,3,6,8};
        int target = 14;
        int res[] = new int[2];
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            int find = target - arr[i];
            if(map.containsKey(find)){
              res[0] = map.get(find);
              res[1] = i;
              break;
            }
            map.put(ele,i);
        }
        System.out.println(Arrays.toString(res));
    }
    
}
