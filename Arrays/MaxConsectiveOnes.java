package arrays;

public class MaxConsectiveOnes {
    static int maxConsectiveOnes(int[] arr){
        int max=0;
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
               c++;
               if(c>max){
                max = c;
               }
            }
            else{
                c=0;
            }
        }
        return max;
    }
public static void main(String[] args) {
   int arr[] = {1,1,1,0,1,1,1,1,0,1};
    System.err.println(maxConsectiveOnes(arr));
    
} 
}
