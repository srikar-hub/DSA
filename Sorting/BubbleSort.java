package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8,46,24,52,9};
        int a[]=bubbleSort(arr);
        System.out.println(Arrays.toString(a));
    }
    static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
