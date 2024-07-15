// import java.util.*;

// class SCL {
//     Node first;
//     int count = 0;

//     class Node{
//         int data;
//         Node link;

//         public Node(int data){
//             this.data = data;
//             this.link = null;
//         }

//     }
//     public void insertAtFirst(int data) {
//         Node newNode = new Node(data);
//         if (first == null) {
//             first = newNode;
//             return;
//         }

//         newNode.link = first;
//         first = newNode;
//     }

//     public int count_Node(){
//         Node current = first;
//         if(first == null){
//             return 0;
//         }
//         int count = 1;
//         while(current.link != first){
//             count++;
//             current = current.link;
//         }
//        return count;
//     }
// }
// public class Lab_10_58 {
//     public static void main(String[] args){
//         int count = 0;
//         SCL list = new SCL();
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0;i<5;i++){
//             int data = sc.nextInt();
//             list.insertAtFirst(data);
            
//         }
//         list.count_Node();
//         System.out.println("count of nodes are "+ count);
        
        


//     }
// }
import java.util.Scanner;

class SCL {
    Node first;

    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            newNode.link = first; 
            return;
        }

        Node save = first;
        while (save.link != first) {
            save = save.link;
        }
        newNode.link = first;
        first = newNode;
        save.link = first;
    }

    public int countNode() {
        if (first == null) {
            return 0;
        }

        int count = 1;
        Node temp = first;
        while (temp.link != first) {
            count++;
            temp = temp.link;
        }
        return count;
    }
}

public class Lab_10_58 {
    public static void main(String[] args) {
        SCL list = new SCL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers to add to the list:");
        for (int i = 0; i < 5; i++) {
            int data = sc.nextInt();
            list.insertAtFirst(data);
        }

        int count = list.countNode();
        System.out.println("Count of nodes is " + count);
    }
}
