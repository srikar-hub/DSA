package InterviewQuestions;

public class FindFirstAndLastOccurenceInOneIteration {
    public static void main(String[] args) {
        int target = 1;
        int[] arr={213,4,24,25,1,37,1};
        boolean found = false;
        int ffI = -1;
        int sfI = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(!found){
                    ffI=i;
                    sfI=i;
                    found=true;
                }
                else{
                    sfI=i;
                }
            }
        }
        if(found==false){
            System.out.println("Element Not found");
        }
        System.out.println(ffI+" "+sfI);
    }
}
