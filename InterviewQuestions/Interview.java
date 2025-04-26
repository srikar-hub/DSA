import java.util.*;
public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
               int element = arr[i];
               list.add(element);
        }
        // int res = solve(m,list);
       int res =  priority(list,m);
        System.out.println(res);
    }
     static int solve(int customers,List<Integer> list){
        int sum = 0;
        for(int i=0;i<customers;i++){
           int maxElement = max(list);
           sum+=maxElement;
        }
        return sum;
    }
    public static int max(List<Integer> list){
        int maxElement =list.get(0);
        int maxIndex = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>maxElement){
                maxElement = list.get(i);
                maxIndex = i;
            }
        }
        int element = list.get(maxIndex)-1;
        list.remove(maxIndex);
        list.add(maxIndex,element); 
        return maxElement;
    }

    public static int priority(List<Integer> list , int cus)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>( (x,y)->{
            return y-x;
        } );
        for(int ele : list){
            pq.add(ele);
        }
        int sum = 0;
        while(cus-->0)
        {
            int ele = pq.poll();
            sum += ele;
            ele--;
            pq.add(ele);
        }
        return sum;
    }
}
