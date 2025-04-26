package arrays;
import java.util.*;
public class Set0s1s2s1 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,2,1,0};
        int cnt=0;
        int cnt2=0;
        int cnt3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt++;
            }
            else if(arr[i]==1){
                cnt2++;
            }
            else if(arr[i]==2){
                cnt3++;
            }
        }
        for(int i=0;i<cnt;i++){
            arr[i]= 0;
        }
        for(int i=cnt;i<cnt2+cnt;i++){
            arr[i]= 1;
        }
        for(int i=cnt2+cnt;i<cnt3+cnt+cnt2;i++){
            arr[i]= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
