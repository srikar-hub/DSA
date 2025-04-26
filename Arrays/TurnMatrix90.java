package Arrays;

public class TurnMatrix90 {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},{4,5,6},{7,8,9}
        };
        int n=arr.length;
        int res[][] = new int[n][n];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               res[j][n-1-i] = arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
   
    }
}
