import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumberOfSubSequence {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }   
        System.out.println("Enter sum");
        int sum = sc.nextInt();
        printAllSequenceWithSumK(arr,0,list,sum,0,arr.length);
    }
    static int printAllSequenceWithSumK(int[] arr,int i,List<Integer> list,int sum,int s,int len){
        
        if (i==len) {
           if(sum==s){
            return 1; 
           }
           return 0;
        }
        list.add(arr[i]);
        s+=arr[i];
        int left = printAllSequenceWithSumK(arr, i+1, list, sum, s,len);
        list.remove(list.size()-1);
        s-=arr[i];
        int right = printAllSequenceWithSumK(arr, i+1, list, sum, s,len);
        return left+right;
    }
}
