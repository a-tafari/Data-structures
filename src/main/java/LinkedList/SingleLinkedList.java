package LinkedList;

/**
 * Created by abijah on 10/20/16.
 */
public class SingleLinkedList {

    private Node head;
    private Node tail;
    public int size;

    public SingleLinkedList(){
        head = null;
        tail = null;
        size= 0;
    }

    public boolean isEmpty(){
        return head ==null;
    }

    public boolean contains(int n){
      if (head.getData() == n){
          return true;
        }
        else{
            return false;
      }
    }
    public int getSize(){
        return size;
    }

    public void addAtStart(int value){
        Node nullPointer = new Node(value, null);
        size++;
        if (head == null){
            head = nullPointer;
            tail = head;
        }
        else{
            nullPointer.setLink(head);
            head = nullPointer;
        }
    }
    public void addAtEnd(int value){
        Node nullPointer = new Node(value, null);
        size++;
        if(head == null){
            head = nullPointer;
            tail =head;
        }
        else{

            tail.setLink(nullPointer);
            tail= nullPointer;
        }
    }

    public void addAtPosition(int value, int position){
        Node nullPointer = new Node(value, null);
        Node pointer =head;
        position =position-1;
        for (int i = 1; i < size; i++){
            if (i== position){
                Node temp = pointer.getLink();
                pointer.setLink(nullPointer);
                nullPointer.setLink(temp);
                break;
            }
            pointer =pointer.getLink();
        }
        size++;
    }

    public void removeAtPosition(int position){
        if(position ==1){
            head = head.getLink();
            size--;
            return;
        }
        if(position ==size){
            Node s = head;
            Node t = head;
            while(s!= tail){
                t=s;
                s= s.getLink();
            }
            tail = t;
            tail.setLink(null);
            size--;
            return;
        }
        Node pointer =head;
        position = position -1;

        for(int i =1 ; i < size -1; i++){
            if (i== position){
                Node temp =pointer.getLink();
                temp = temp.getLink();
                pointer.setLink(temp);
                break;
            }
            pointer=pointer.getLink();
        }
        size--;
    }



public class Node{

    public int data;
    public Node link;

    public Node(int d, Node n){
        data = d;
        link = n;

}
    public void setLink(Node n){
        link = n;
    }
    public void setData(int d){
        data = d;
    }
    public Node getLink(){
        return link;
    }
    public int getData(){
        return data;
    }

    }


}
