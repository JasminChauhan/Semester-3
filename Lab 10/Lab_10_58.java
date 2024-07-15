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
