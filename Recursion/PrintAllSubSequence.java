import java.util.*;
public class PrintAllSubSequence {

    public static void main(String[] args) {
        int arr[] = {3,1,2};
       
        List<Integer> list = new ArrayList<Integer>();
        printsub(0,arr,list);
    }
    public static void printsub(int i,int[] arr,List<Integer> list ){
        
        if(i>=arr.length){
            System.out.println(list);
            return ;
        }
        list.add(arr[i]);
        printsub(i+1, arr,list);
        list.remove(list.size()-1);
        printsub(i+1, arr,list);
    }
}
