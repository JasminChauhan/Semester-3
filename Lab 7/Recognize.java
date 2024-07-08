import java.util.*;

class Stack {
    int top = -1;
    char[] s;
    int size = 0;

    public Stack(int size) {
        this.size = size;
        this.s = new char[size];
    }

    public void push(char ch) {
        if (top >= size - 1) {
            System.out.println("Stack overflow!");
            return;
        } else {
            top++;
            s[top] = ch;
        }
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack underflow!");
            return 0;
        } else {
            char ch = s[top];
            top--;
            return ch;
        }
    }
}

public class Recognize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next().trim();
        char[] c = str.toCharArray();

        if (str.length() % 2 == 0) {
            System.out.println("Invalid String");
            return;
        }
        
        int temp = str.length() / 2;
        if (str.charAt(temp) != 'c') {
            System.out.println("Invalid String");
            return;
        }
        
        Stack s1 = new Stack(temp);
        int idx = 0;
        while (idx < temp) {
            s1.push(str.charAt(idx));
            idx++;
        }
        
        idx++; 
        while (idx < str.length()) {
            char ch = s1.pop();
            if (ch != str.charAt(idx)) {
                System.out.println("Invalid String");
                return;
            }
            idx++;
        }
        System.out.println("Valid String");
    }
}
