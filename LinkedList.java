import java.io.*;

public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        Node (int d){
            data= d;
            next= null;

        }
    }
    public void insertAtFront(int newData){
        Node newDataNode = new Node(newData);
        newDataNode.next = head;
        head = newDataNode;
    }



    public void printList(){
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String [] args){
        LinkedList ll = new LinkedList();

        ll.insertAtFront(2);
        ll.insertAtFront(67);
        ll.insertAtFront(78);
        ll.insertAtFront(12);
        ll.printList();

        

    }
}
