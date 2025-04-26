
public class AddList {
      public static Node convertToLinkedList(Node head,int[] arr){  
      Node temp = head;
      for(int i=1;i<arr.length;i++){
        Node newNode = new Node(arr[i]);
        temp.next = newNode;
        temp = temp.next;
      }
      return head;
    }
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dumyNode=new Node(-1);
        Node pointer = dumyNode;
        int carry = 0;
        Node temp1 = l1;
        Node temp2 = l2;
        while(temp1!=null || temp2!=null){
            int sum = carry;
            if(temp1!=null){
              sum += temp1.data;
            }
            if(temp2!=null){
                sum +=temp2.data;
            }
            Node newNode = new Node(sum%10);
            carry = sum/10;
            pointer.next = newNode;
            pointer=pointer.next;
            if(temp1!=null){
                temp1 = temp1.next;
            }
            if(temp2!=null){
                temp2 = temp2.next;
            }
        }
        if(carry!=0){
            Node newNode = new Node(carry);
            pointer.next = newNode;
        }
        return dumyNode.next;
    }
    public static void displayList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,3};
        int arr2[] = {5,6,4};
        Node head1 = new Node(arr1[0]);
        Node head2 = new Node(arr2[0]);
        Node res1 = convertToLinkedList(head1,arr1);
        Node res2 = convertToLinkedList(head2,arr2);
        Node ans = addTwoNumbers(res1,res2);
        displayList(ans);
       
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
