import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4,6,2,5,7,9,1,3};

        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] quickSort(int[] arr){
        qs(arr,0,arr.length-1);
        return arr;
    }
    static void qs(int[] arr,int low,int high){
        // if array have more than one element only the if gets executed
        if(low<high){
           int partitionIndex = partation(arr,low,high);
           qs(arr,low,partitionIndex-1);
           qs(arr,partitionIndex+1,high);
        }
    }

    static int partation(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>=pivot && j>=low){
                j--;
            }
            if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }          
        }
        int temp2 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp2;
        return j;
    }

}
