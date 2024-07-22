import java.util.*;
import java.util.Stack;

public class Lab_8_48 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();         //postfix expression
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i))){
                stack.push(str.charAt(i) - '0');
            }
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '^' || str.charAt(i) == '*'
                    || str.charAt(i) == '/') {
                // stack.push(Integer.parseInt(Character.toString(str.charAt(i))));
                int op2 = stack.pop();
                int op1 = stack.pop();
                char operator = str.charAt(i);
                switch (operator) {
                    case '+':
                        stack.push(op1 + op2);
                        break;

                    case '-':
                        stack.push(op1 - op2);
                        break;

                    case '*':
                        stack.push(op1 * op2);
                        break;

                    case '/':
                        stack.push(op1 / op2);
                        break;

                    case '^':
                        stack.push((int) Math.pow(op1, op2));
                        break;

                    default:
                        System.out.println("invalid string");
                        return;

                }
            }
        }
        System.out.println("The value is = "+stack.pop());
    }

}
