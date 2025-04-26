package arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,6,8};
        int target = 14;
        int left=0;
        int right=arr.length-1;
        boolean found = false;
       while(left<right){
           int sum = arr[left] + arr[right];
           if(sum == target){
            found=true;
            break;
           }
           if(sum>target){
            right--;
           }
           else{
            left++;
           }
       }
       System.out.println(found);
    }
}
