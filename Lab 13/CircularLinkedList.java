import java.util.*;

class CLL{
    Node first;
    Node last;
    class Node{
        int data;
        Node link;

        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }

    // public void makeCircular(){
    //     if(first == null){
    //         System.out.println("Linked List is empty");
    //         first = newNode; 
    //     }
    //     Node temp = last;
    //     while(temp.link != null){
    //         temp = temp.link;
    //     }
    //     last = temp;
    //     last.link = first;
    // }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(first == null){ 
            first = newNode; 
            first.link = first;
            last = first; 
            last.link = first; 
            return; 
        }else{ 
            Node temp = first; 
            Node temp2 = last; 
            while(temp.link != first){
            temp = temp.link; 
        } 
            temp.link = newNode; 
            newNode.link = first;
            first =  newNode;  
        } 
            
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            first = last;
            first.link = first;
            last.link = first;
            return;
        }
        else{
            Node temp = first;
            newNode.link = first;
            while(temp.link != first){
                temp = temp.link;
            }
            last = temp;
            last.link = newNode;
            System.out.println(temp.data);
           
            
        }
    }

    public void insertAtOrderedList(int data){

    }

    public void display(){
        if(first == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = first;
        
             while(temp.link != first){
                System.out.print(temp.data + "=>");
                temp = temp.link;
            }  
            System.out.print(temp.data);
       
    }
}
public class CircularLinkedList{
    public static void main(String [] args){
        CLL c = new CLL();
        c.insertAtFirst(10);
        c.insertAtFirst(20);
        c.insertAtLast(40);
        c.display();
    }
}