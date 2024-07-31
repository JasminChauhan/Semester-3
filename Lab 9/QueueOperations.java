import java.util.*;
class Queue{
    int f = -1;
    int r = -1;
    int q[];
    int n;

    public Queue(int size){
        this.n = size;
        this.q = new int[n];
    }


    public void enqueue(int data){
        if(r >= n){
            System.out.println("Queue overflow...");
            return;
        }
        else{
            r++;
            q[r] = data;
            if(f == -1){
                f = 0;
                return;
            }
        }
    }

    public int dequeue(){
        
        if(f == -1){
            System.out.println("Queue Underflow...");
            return 0;
        }
        else{ 
            int data = q[f];  
            if(f == r){
                f = -1;
                r = -1;
                return data;
            }    
            else{
                f++;
            }
               return data;  
        }
            
    }

    public void display(){
        for(int i = f; i <= r; i++){
            System.out.println(q[i]);
        }
    }


}

public class QueueOperations{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of queue: ");
        int size = sc.nextInt();
        System.out.println("enter choice: \n 1 for enqueue \n 2 for dequeue \n 3 for display \n 4 for exit");
        int choice = sc.nextInt();

        Queue q = new Queue(size);


        while(true){
            switch(choice){
                case 1:
                    System.out.println("enter number to enqueue");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice ");
            }
        }
            

        // q.enqueue(10);
        // q.enqueue(20);
        // q.enqueue(30);
        // q.dequeue();
        // q.display();
    }
}
