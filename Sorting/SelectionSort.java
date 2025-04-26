package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int[] a=selectionSort(arr);
        System.out.println(Arrays.toString(a));
    }
    static int[] selectionSort(int[] arr){
        int n=arr.length;
         for(int i=0;i<=n-2;i++){
            
            int min = i;
            for(int j=i;j<=n-1;j++){
               if(arr[j]<arr[min]){
                min=j;
               }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
         }
         return arr;
    }
}
