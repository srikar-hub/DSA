public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,9,16,19,20};
        int target = 19;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
