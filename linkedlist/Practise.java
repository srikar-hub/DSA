package linkedlist;

import java.util.Scanner;

public class Practise {


    public static Node convertToLinkedList(Node head,int[] arr){  
      Node temp = head;
      for(int i=1;i<arr.length;i++){
        Node newNode = new Node(arr[i]);
        temp.next = newNode;
        temp = temp.next;
      }
      return head;
    }
 

    public static int sizeOfList(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
         count++;
         temp=temp.next;
        }
        return count;
    }

    public static void displayList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        Node head = new Node(arr[0]);
        Node res = convertToLinkedList(head,arr);
        int size = sizeOfList(head);
        System.out.println("The Size of the Linked list is "+size);
        System.out.println("The elements are : ");
        displayList(head);
    }
}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
