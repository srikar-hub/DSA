package Arrays;

public class FindMissingNumber1 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        int n=6;
        System.out.println(findMissing(arr,n));
    }
    static int findMissing(int[] arr,int n){

        int nums[] = new int[n+1];
         
        for(int i=0;i<arr.length;i++){
             nums[arr[i]]=1;
        }
        for(int i=1;i<=n;i++){
            if(nums[i]==0){
                return i;
            }
        }
        return -1;
    }
} 
