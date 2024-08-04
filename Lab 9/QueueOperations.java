import java.util.*;

class Queue {
    int f = -1;
    int r = -1;
    int q[];
    int n;

    public Queue(int size){
        this.n = size;
        this.q = new int[n];
    }

    public void enqueue(int data){
        if(r >= n - 1){
            System.out.println("Queue overflow...");
            return;
        } else {
            r++;
            q[r] = data;
            if(f == -1){
                f = 0;
            }
        }
    }

    public int dequeue(){
        if(f == -1){
            System.out.println("Queue underflow...");
            return 0;
        } else { 
            int data = q[f];  
            if(f == r){
                f = -1;
                r = -1;
            } else {
                f++;
            }
            return data;  
        }
    }

    public void display(){
        if(f == -1){
            System.out.println("Queue is empty...");
        } else {
            for(int i = f; i <= r; i++){
                System.out.print(q[i] + " ");
            }
        }
    }
}

public class QueueOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);

        while(true){
            System.out.println("Enter choice: \n 1 for enqueue \n 2 for dequeue \n 3 for display \n 4 for exit");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter number to enqueue:");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;

                case 2:
                    int dequeued = q.dequeue();
                    if (dequeued != 0) {
                        System.out.println("Dequeued: " + dequeued);
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
                    System.out.println("Invalid choice");
            }
        }
    }
}
