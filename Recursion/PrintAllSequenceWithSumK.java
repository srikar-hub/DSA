import java.util.*;
public class PrintAllSequenceWithSumK {
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
    static void printAllSequenceWithSumK(int[] arr,int i,List<Integer> list,int sum,int s,int len){
        
        if (i==len) {
           if(sum==s){
            System.out.println(list); 
           }
           return;
        }
        list.add(arr[i]);
        s+=arr[i];
        printAllSequenceWithSumK(arr, i+1, list, sum, s,len);
        list.remove(list.size()-1);
        s-=arr[i];
        printAllSequenceWithSumK(arr, i+1, list, sum, s,len);
    }
}
