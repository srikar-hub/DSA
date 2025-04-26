
import java.util.*;
public class Bst{
    public static Node insert(Node root,int data){
      if(root==null){
        return new Node(data);
      }
      else if(data>root.data){
        root.right = insert(root.right, data);
      }
      else if(data<root.data){
        root.left = insert(root.left, data);
      }
      return root;
    }

    public static void inOrder(Node root){
      if(root!=null){
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i=0;i<n;i++)
        {
            root = insert(root,arr[i]);
        }       
        
        inOrder(root);
    }
}

class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data = data;
    }
}