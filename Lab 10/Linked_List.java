import java.util.Scanner;

class LinkedList {
    Node first;

    class Node {
        String data;
        Node link;

        Node(String data) {
            this.data = data;
            this.link = null;
        }
    }

    public void addFirst(String data) {
        if (data == null) {
            System.out.println("Cannot add null data to the list.");
            return;
        }
        Node newNode = new Node(data);
        newNode.link = first;
        first = newNode;
    }

    public void addLast(String data) {
        if (data == null) {
            System.out.println("Cannot add null data to the list.");
            return;
        }

        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }

        Node currNode = first;
        while (currNode.link != null) {
            currNode = currNode.link;
        }
        currNode.link = newNode;
    }

    public void printList() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = first;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.link;
        }
        System.out.println("NULL");
    }

    public void delete(String data) {
        if (data == null) {
            System.out.println("Cannot delete null data from the list.");
            return;
        }

        if (first == null) {
            System.out.println("The list is empty");
            return;
        }

        if (first.data.equals(data)) {
            deleteFirstNode();
            return;
        }

        Node currNode = first;
        Node prevNode = null;

        while (currNode != null && !currNode.data.equals(data)) {
            prevNode = currNode;
            currNode = currNode.link;
        }

        if (currNode != null) {
            prevNode.link = currNode.link;
        } else {
            System.out.println("The given data is not present in the list");
        }
    }

    public void deleteFirstNode() {
        if (first == null) {
            System.out.println("The given linked list is empty");
            return;
        }
        Node currNode = first;
        first = first.link;
        currNode.link = null;
    }

    public void deleteLastNode() {
        if (first == null) {
            System.out.println("The given linked list is empty");
            return;
        }

        if (first.link == null) {
            first = null;
            return;
        }

        Node currNode = first;
        Node prevNode = null;

        while (currNode.link != null) {
            prevNode = currNode;
            currNode = currNode.link;
        }
        prevNode.link = null;
    }

    public void countNodes() {
        if (first == null) {
            System.out.println("The given linked list is empty");
            return;
        }

        int num = 0;
        Node currNode = first;
        while (currNode != null) {
            num++;
            currNode = currNode.link;
        }
        System.out.println("Number of nodes in the linked list is: " + num);
    }
}

public class Linked_List {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert Node At Start");
            System.out.println("2. Insert Node At End");
            System.out.println("3. Delete A Node");
            System.out.println("4. Delete First Node");
            System.out.println("5. Delete Last Node");
            System.out.println("6. Count Number Of Nodes");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert: ");
                    String data = sc.nextLine();
                    list.addFirst(data);
                    list.printList();
                    break;

                case 2:
                    System.out.print("Enter the data to insert: ");
                    String data1 = sc.nextLine();
                    list.addLast(data1);
                    list.printList();
                    break;

                case 3:
                    System.out.print("Enter the data to delete: ");
                    String data2 = sc.nextLine();
                    list.delete(data2);
                    list.printList();
                    break;

                case 4:
                    list.deleteFirstNode();
                    list.printList();
                    break;

                case 5:
                    list.deleteLastNode();
                    list.printList();
                    break;

                case 6:
                    list.countNodes();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
