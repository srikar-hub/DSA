package arrays;

import java.util.Arrays;

public class RearrangeElements0 {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int[] res = arrangeElementsBySign(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] arrangeElementsBySign(int[] arr){
           int[] postiveArray = new int[arr.length/2];
           int[] negativeArray = new int[arr.length/2];
           int nc =0;
           int pc=0;
           for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negativeArray[nc++] = arr[i];
            }
            else{
                postiveArray[pc++] = arr[i];
            }
           }
           for(int i=0;i<postiveArray.length;i++){
            arr[i*2]=postiveArray[i];
            arr[i*2+1]=negativeArray[i];
           }
           return arr;
    }
}
