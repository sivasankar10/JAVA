package CLGPREP;

class LinkedList{
    public void add(int i) {
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    void  insertadd(int data){
        Node newnode=new Node(data);
        if(head==null)
            head=newnode;
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    void printrev(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}

public class Main
{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertadd(1);
        list.insertadd(2);
        list.insertadd(3);
        list.insertadd(4);
        list.insertadd(5);
        list.printrev();

    }
}