package Binary_Search;

public class FindAnELementInInfiniteArray {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 14;
        System.out.println(sol(arr,target));
    }
    static int sol(int[] arr,int k){
           int start = 0;
           int end = 1;
           while(arr[end]<k){
              int temp  = end + 1;
              end = end + (end-start)*2;
              start = temp;
           }
           return binarySearch(arr, k,start,end);
           
    }
    static int binarySearch(int[] arr,int k,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<k){
                start = mid + 1;
            }
            else if(arr[mid]>k){
                end = mid-1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
}
