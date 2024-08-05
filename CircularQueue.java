import java.util.*;

class Queue {
    int f = -1;
    int r = -1;
    int q[];
    int n;

    public Queue(int size) {
        this.n = size;
        this.q = new int[n];
    }

    public void cqInsert(int data) {
        if (r == n) {
            r = 0;
        } else {
            r++;
        }
        if (f == r) {
            System.out.println("Queue Overflow...");
            return;
        }
        q[r] = data;
        if (f == -1) {
            f = 0;
            return;
        }
    }

    public int cqDelete() {
        if (f == -1) {
            System.out.println("Queue Underflow...");
            return 0;
        }
        int data = q[f];
        if (f == r) {
            f = -1;
            r = -1;
            return data;
        }
        if (f == n) {
            f = 0;
        } else {
            f++;
        }
        System.out.println(data);
        return data;
    }

    public void display() {
        if (f == -1) {
            System.out.println("Queue is empty...");
        } else {
            for (int i = f; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int data = sc.nextInt();
                    q.cqInsert(data);
                    break;
                case 2:
                    int deletedValue = q.cqDelete();
                    if (deletedValue != 0) {
                        System.out.println("Deleted value: " + deletedValue);
                    }
                    break;
                case 3:
                    System.out.println("Queue :");
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }

    }
}