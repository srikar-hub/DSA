package arrays;

public class MaximumElement {
    public static void main(String[] args) {
        //update max method
        int arr[] = {1,24,4,45,5,6,0};
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
