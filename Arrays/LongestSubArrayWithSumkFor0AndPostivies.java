
package Arrays;
public class LongestSubArrayWithSumkFor0AndPostivies {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,10,3,3};
        int k=6;
        System.out.println(sol(arr,k));
        
    }
    static int sol(int[] arr,int k){
        int n=arr.length;
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = arr[0];
        while(right<n){  
           
            if(sum == k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            while(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }   
            right++;
            if(right<n){
                sum+=arr[right];
            }   
        }
        return maxLen;
    }
}
