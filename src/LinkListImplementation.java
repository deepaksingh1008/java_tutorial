class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

}
class LinkList {
    Node head;
    LinkList(){
        this.head=null;
    }
    void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next=newNode;
    }
    void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");

    }
    void addBeg(int data){
         Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        head=newNode;
        head.next=current;
    }
    void addEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
             current=current.next;
        }
        current.next=newNode;
    }
    void AddInPosition(int position,int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(position==1){
            addBeg(data);
            return;
        }
        Node current = head;
        while(current!=null && position!=1){
            current = current.next;
            position--;
        }
        if(current==null){
            System.out.println("Invalid Position");
            return;
        }
        Node temp = current.next;
        current.next=newNode;
        current.next.next=temp;

    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
             head=null;
             return;
        }
        Node current = head;
        while(current.next.next!=null){
           current=current.next;
        }
        current.next=null;
    }
    void deleteAtBeg(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current = head;
        head=head.next;
        current = null;
    }
    void deleteAtPosition(int data){

    }

}


public class LinkListImplementation {
    public static void main(String[] args){
        LinkList list = new LinkList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.addBeg(6);
        list.addEnd(10);
        list.AddInPosition(4,11);
        list.addBeg(23);
        list.AddInPosition(1,25);
        list.AddInPosition(1,26);
        list.deleteAtEnd();
        list.deleteAtBeg();
        list.display();


    }
}
