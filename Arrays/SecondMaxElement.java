package arrays;

public class SecondMaxElement {
    public static void main(String[] args) {
        int arr[] = {1,23,4,45,45,6,7,33};
        int largest = arr[0];
        int secondLargest = -1;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]>largest){
                secondLargest = largest;
                largest=arr[idx];
            }
            else if(arr[idx]>secondLargest && arr[idx]!=largest){
                secondLargest = arr[idx];
            }
        }
        System.out.println(secondLargest);
    }
}
