class Node{
    int data;
    Node next;
 }

 class LinkedList{
     Node head;
     public void insert(int n){
         Node node = new Node();
         node.data=n;
         node.next=null;
        //  System.out.println(node1.data);
        //  System.out.println(node1.next);

        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }

     }

     public void insertAtStart(int n){
         Node node1 = new Node();
         node1.data=n;
         node1.next=head;
         head=node1;
     }

     public void show(){
         while(head.next!=null){
         System.out.println(head.data);
         head = head.next;
         }
        System.out.println(head.data);
      //  System.out.println(node.next);

     }
   
 }

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(15);
        ll.insert(12);
        ll.insert(155);
        ll.insertAtStart(52);
        ll.show();

    }
    
}
 