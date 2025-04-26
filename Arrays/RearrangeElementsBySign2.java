package arrays;

import java.util.Arrays;

public class RearrangeElementsBySign2 {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int[] a = arrangeElementsBySign(arr);
        System.out.println(Arrays.toString(a));
    }
    static int[] arrangeElementsBySign(int[] arr){
         int postiveIndex = 0;
         int negativeIndex = 1;
         int[] num = new int[arr.length];
         for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                num[negativeIndex] = arr[i];               
                negativeIndex+=2;
            }
            else{
                num[postiveIndex] = arr[i];  
                postiveIndex+=2;
            }
         }
         return num;
    }
}
