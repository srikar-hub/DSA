public class crudOfStrings {
    public static void main(String[] args) {
        // to insert use append in string Buildler

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("srikar");
       
        stringBuilder.append("shelloss");
        


        // delete use 
        // ** end = index -1 ;
       // stringBuilder.deleteCharAt(1);
    //    stringBuilder.delete(1,3);
    //    System.out.println(stringBuilder);
       // or to replace based on characters or sequence use replace() method in strings
    //    String str = stringBuilder.toString();
    //    String newStr = str.replace("s", "");
    //    System.out.println(newStr);


        
        // update use String.replace in String or the replace in the StringBuilder
       // end = (index-1)  
    //    stringBuilder.replace(1,3,"yeah");
    //    System.out.println(stringBuilder);
        // String str = stringBuilder.toString();
        // String newStr = str.replace("s", "a");

      
    }
}
