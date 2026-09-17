package prac6;

import java.util.*;

public class problem3 {

    static int priority(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '^')
            return 3;

        return 0;
    }

    static String postfix(String exp) {

        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty())
                    stack.pop();
            }

            else {
                while (!stack.isEmpty() &&
                       priority(stack.peek()) >= priority(ch))
                    result += stack.pop();

                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    public static void main(String[] args) {

        String exp1 = "3+4*2";
        String exp2 = "(3+4)*2";

        System.out.println("Infix: " + exp1);
        System.out.println("Postfix: " + postfix(exp1));

        System.out.println();

        System.out.println("Infix: " + exp2);
        System.out.println("Postfix: " + postfix(exp2));
    }
}
