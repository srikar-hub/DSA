package strin;

import java.util.Scanner;

public class SmallOrLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        String res = find(input);
        System.out.println(res);
    }
    static String find(String s){
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
               str.append((char)(s.charAt(i)+32));
            }
            else{
                str.append((char)(s.charAt(i)-32)); 
            }
        }
        
        return str.toString();
    }
}
