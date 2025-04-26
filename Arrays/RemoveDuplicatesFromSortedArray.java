package arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        // To pointer approach
        int arr[] = {1,1,2,2,2,3,4,4,4,5};
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }

}
