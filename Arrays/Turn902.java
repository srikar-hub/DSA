package Arrays;

public class Turn902 {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate90degree(arr);
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
      
    }
    static void rotate90degree(int[][] matrix) 
    {

        //Transpose each row
        for(int i=0;i<matrix.length;i++){
            // only traverse in the upper side traingle in the matrix
            for(int j=i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // Reverse each row
        for(int i=0;i<matrix.length;i++){
            int start = 0;
            int end = matrix.length-1;
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
