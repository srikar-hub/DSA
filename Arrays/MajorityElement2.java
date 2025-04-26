package arrays;
// Moore's Voting Algorithm
public class MajorityElement2 {
    public static  int ele; 
    static int findMajority(int[] arr){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
           if(cnt == 0){
            cnt = 1;
            ele=arr[i];
           }
           else if(arr[i] == ele){
                cnt++;
           }
           else{
            cnt--;
           }
        }
        int cnt2=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==ele){
                cnt2++;
            }
        }
        if(cnt2>(arr.length/2)){
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5,7,7,7,7};
        System.out.println(findMajority(arr));
    }
}
