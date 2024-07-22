import java.util.*;
import java.util.Stack;

class StackValue {
    public static int StackPrecedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 2;
        } else if (ch == '*' || ch == '/') {
            return 4;
        } else if (ch == '^') {
            return 5;
        } else if (ch == '(') {
            return 0;
        } else {
            return 8;
        }
    }

    public static int FunctionPrecedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 3;
        } else if (ch == '^') {
            return 6;
        } else if (ch == '(') {
            return 9;
        } else if (ch == ')') {
            return 0;
        } else {
            return 7;
        }
    }

    public static int Rank(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return -1;
        } else {
            return 1;
        }
    }
}

public class Lab_8_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter infix to convert in prefix: ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ')') {
                sb.setCharAt(i, '(');
            } else if (sb.charAt(i) == '(') {
                sb.setCharAt(i, ')');
            }
        }
        String reversed = sb.reverse() + "";
        // System.out.println(a);

        char next = reversed.charAt(0);
        char temp;
        int top = 1;
        int rank = 0;
        String postfix = "";
        StackValue s1 = new StackValue();

        Stack<Character> stack = new Stack<>();
        stack.push('(');

        for (int i = 0; i < reversed.length(); i++) {
            next = str.charAt(i);

            if (stack.size() < 1) {
                System.out.println("invalid String");
                return;
            }

            while (s1.StackPrecedence(stack.peek()) > s1.FunctionPrecedence(next)) {
                temp = stack.pop();
                postfix += temp;
                rank = rank + s1.Rank(temp);

                if (rank < 1) {
                    System.out.println("inavalid string");
                    return;
                }
            }

            if (s1.StackPrecedence(stack.peek()) != s1.FunctionPrecedence(next)) {
                stack.push(next);
            } else {
                stack.pop();
            }

        }

        if (!stack.isEmpty() && rank != 1) {
            System.out.println("invalid");
            return;
        } else {
            StringBuilder sb1 = new StringBuilder(postfix);
            sb1.reverse();
            System.out.println(sb1);
            // System.out.println(postfix);
            System.out.println("VALID");
        }

    }
}
