package Arrays;


// The time complexity is 0(n*2)

public class FindMissingNumber0 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        int n=6;
        System.out.println(findMissing(arr,n));

    }
    static int findMissing(int[] arr,int n){
       
       for(int i=1;i<=n;i++){
        int flag=0;
        
          for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
              flag=1;
              break;
            }
          }
          if(flag==0){
             
            return i;
          }
       }
    return -1;
    }

}
