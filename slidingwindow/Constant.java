    public class Constant {
        
        public static void main(String[] args) {
            int arr[] = {1,2,3,6,2,5,10};
            int l = 0;
            int k = 4;
            int r = k-1;
            int sum = 0;
            int max = 0;
            for(int i=l;i<=r;i++){
                sum+=arr[i];
            }
            max = sum;
            while(r<arr.length-1){
                sum -=arr[l];
                l++;
                r++;
                sum +=arr[r];
                max = Math.max(max,sum);
            }
            System.out.println(max);
        }
    }
