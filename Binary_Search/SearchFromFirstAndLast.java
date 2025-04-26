package Binary_Search;
import java.util.*;
public class SearchFromFirstAndLast {
    public static void main(String[] args) {
        int arr[] = {1,9,16,19,19,19,20};
        int target = 19;
        int arr1[] = new int[2];
        int num1 = binarySearch(arr,target,true);
        int num2 = binarySearch(arr,target,false);
        arr1[0] =num1;
        arr1[1]= num2; 
        System.out.println(Arrays.toString(arr1));
    }
    static int binarySearch(int[] arr,int target,boolean firstAndLast){
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                if(firstAndLast){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

}
