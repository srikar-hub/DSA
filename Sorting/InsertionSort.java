package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {8,46,24,52,9};
        int a[]=insertionSort(arr);
        System.out.println(Arrays.toString(a));
    }

   static int[] insertionSort(int[] arr) {
    int n=arr.length;
    for(int i=0;i<=n-1;i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
    }
    return arr;
    }
    
}

