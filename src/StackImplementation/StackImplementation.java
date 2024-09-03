package StackImplementation;

class Node {
     int val;
     Node next;
     Node(int data){
         this.val=data;
         this.next=null;
     }
}
class Stack {
    Node head;
    Stack(){
        this.head = null;
    }
    void Push(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node temp;
            temp = head;
            while(temp.next != null){
                 temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }
    void Pop(){
        if(head==null){
            System.out.println("Stack is Empty");
        }
        else{
            Node temp = head;
            if(temp.next == null){
                head = null;
                System.out.println("Element is deleted");
                return;
            }
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            System.out.println("Element is deleted");
        }
    }
    void display(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.val);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}


public class StackImplementation {
    public static void main(String[] args){
    Stack st = new Stack();
    st.Push(12);
    st.Push(13);
    st.Push(15);
    st.Pop();
    st.display();
    }
}
