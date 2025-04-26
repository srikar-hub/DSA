package arrays;

import java.util.*;

public class RearrangeElementsCase2 {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4,10,11,-99};
        int[] a = arrangeElementsBySign(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] arrangeElementsBySign(int[] arr){
        List<Integer> postiveArray = new ArrayList<Integer>();
        List<Integer> negativeArray= new ArrayList<Integer>();
      
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negativeArray.add(arr[i]);
            }
            else{
                postiveArray.add(arr[i]);
            }
        }
        if(postiveArray.size()>negativeArray.size()){
            for(int i=0;i<negativeArray.size();i++){
                arr[i*2]=postiveArray.get(i);
                arr[i*2+1]=negativeArray.get(i);
            }
            int index = negativeArray.size()*2;
            for(int i=negativeArray.size();i<postiveArray.size();i++){
                arr[index++]=postiveArray.get(i);
            }
        }
        else{
            for(int i=0;i<postiveArray.size();i++){
                arr[i*2]=postiveArray.get(i);
                arr[i*2+1]=negativeArray.get(i);
            }
            int index = postiveArray.size()*2;
            for(int i=postiveArray.size();i<negativeArray.size();i++){
                arr[index++]=postiveArray.get(i);
            }
        }
        return arr;  
    }
}
