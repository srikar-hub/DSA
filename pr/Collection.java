package pr;
import java.util.*;
public class Collection {
    public static void main(String[] args) {
        
      // Arrays.asList Does not work for the primitives.int []
      // we can get values by keys but we cannot get keys using values
     // addAll and retainAll any collection to any collection 


      List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5));
      // adding a list into a set
        Set<Integer> set = new HashSet<>(list);

        //adding set into a list
        List<Integer> list2 = new ArrayList<>(set);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(40);
        if(set.contains(40)){
            System.out.println("Yeah it contains the number you have given");
        }
        else{
            System.out.println("Nope sorry Friend");
        }
        set.remove(40);
        // if(set.contains(40)){
        //     System.out.println("Yeah it contains the number you have given");
        // }
        // else{
        //     System.out.println("Nope sorry Friend");
        // }


        // Iterating an HashSet
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
        }


       Map<Integer,String> map = new HashMap<Integer,String>();
       map.put(1,"Sri");
       map.put(2,"koppunoori");
       map.put(3,"Nene");


       map.remove(3);
       System.out.println(map);
       System.out.println(map.get(1));
      

    //    if(map.containsValue("Sri")){
    //     System.out.println("Yeah there is a value in the map which you are searching for");
    //    }
    //    else{
    //     System.out.println("Sorry frnd no value");
    //    }
    //    if(map.containsKey(1)){
    //     System.out.println("Yeah there is a key  in the map which you are searching for");
    //    }
    //    else{
    //     System.out.println("Sorry frnd no key");
    //    }



    //    for(Map.Entry<Integer,String> entry:map.entrySet()){
    //     System.out.println(entry.getKey() +" "+entry.getValue());
    //    }
      


    //    // Not recomended..
    //    for(int key : map.keySet()){
    //     System.out.println(key +" "+map.get(key));
    //    }

    //    for(String val:map.values()){
    //     System.out.println(val);
    //    }




    }
}
