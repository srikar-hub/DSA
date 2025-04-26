package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,5,6};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr){
        ms(arr,0,arr.length-1);
    }
    static void ms(int[] arr,int low,int high){
          if(low>=high){
            return;
          }
          int mid = (low+high)/2;
          ms(arr,low,mid);
          ms(arr,mid+1,high);
          merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=low;i<=high;i++){
           arr[i] = temp.get(i-low);
        }
    }
}
