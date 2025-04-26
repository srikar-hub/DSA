
import java.util.*;
public class BinaryTree{

    public static void inOrder(Node root){
      if(root!=null){
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
      }
    }
    public static List<List<Integer>> levelOrder(Node root){
         Queue<Node> queue = new LinkedList<Node>();
         List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
         if(root==null){
          return wrapList;
         }
         queue.offer(root);
         while(!queue.isEmpty()){
          int size = queue.size();
          List<Integer> sublist = new LinkedList<Integer>();
          for(int i=0;i<size;i++){
            Node currentNode = queue.poll();
            sublist.addLast(currentNode.data);
            if(currentNode.left!=null){
              queue.offer(currentNode.left);
            }
            if(currentNode.right!=null){
              queue.offer(currentNode.right);
            }
          }
          wrapList.add(sublist);
         }
         return wrapList;
    }
    public static List<List<Integer>> zigzag(Node root){
      Queue<Node> queue = new LinkedList<Node>();
      List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
      if(root==null){
       return wrapList;
      }
      boolean isLeftToRight = true;
      queue.offer(root);
      while(!queue.isEmpty()){
       int size = queue.size();
       List<Integer> sublist = new LinkedList<Integer>();
       for(int i=0;i<size;i++){
        Node currentNode = queue.poll();
        if(isLeftToRight){
          sublist.addLast(currentNode.data);
        }
        else{
          sublist.addFirst(currentNode.data);
        }
        if(currentNode.left!=null){
           queue.offer(currentNode.left);
         }
         if(currentNode.right!=null){
           queue.offer(currentNode.right);
         }
       }
       wrapList.add(sublist);
       isLeftToRight=!isLeftToRight;
      }
      return wrapList;
 }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right= new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7); 
        // inOrder(node);
      List<List<Integer>> tlist = levelOrder(node);
      System.out.println(tlist);


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
